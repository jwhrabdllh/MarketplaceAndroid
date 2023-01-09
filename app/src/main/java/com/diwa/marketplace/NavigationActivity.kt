package com.diwa.marketplace

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.diwa.clonetokopedia.R
import com.diwa.clonetokopedia.databinding.ActivityNavigationBinding
import com.diwa.marketplace.ui.login.LoginActivity
import com.diwa.marketplace.utils.Preferences

class NavigationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_navigation)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val preff = Preferences(this)

        navView.setOnItemSelectedListener {
            if (it.itemId == R.id.navigation_home) {
                Log.d("Tes", "User mengklik button home")

                if (preff.getIsLogin("login")) {
                    navController.navigate(it.itemId)
                    Log.d("Tes", "User sudah login")
                } else {
                    startActivity(Intent(this, LoginActivity::class.java))
                    Log.d("Tes", "User belum login")
                }
            } else {
                navController.navigate(it.itemId)
                Log.d("Tes", "User mengklik button lain "+ it.itemId)
            }

            return@setOnItemSelectedListener true
        }
    }
}