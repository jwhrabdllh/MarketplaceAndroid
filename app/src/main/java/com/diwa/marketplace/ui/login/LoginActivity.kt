package com.diwa.marketplace.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diwa.clonetokopedia.databinding.ActivityLoginBinding
import com.diwa.marketplace.NavigationActivity
import com.diwa.marketplace.utils.Preferences
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val viewModel: LoginViewModel by viewModel()

    private lateinit var _binding: ActivityLoginBinding
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setData()
    }

    private fun setData(){
        viewModel.text.observe(this) {
            binding.edtEmail.setText(it)
        }

        binding.btnMasuk.setOnClickListener {
            viewModel.ubahData()
        }
    }

    fun testing(){
        val preff = Preferences(this)

        if (preff.getIsLogin("login")){
            binding.tvStatus.text = "Anda sudah Login"
        } else {
            binding.tvStatus.text = "Anda belum Login"
        }

        binding.btnLogin.setOnClickListener {
            preff.setIsLogin("login", true)
            startActivity(Intent(this, NavigationActivity::class.java))
        }

        binding.btnLogout.setOnClickListener {
            preff.setIsLogin("logout", false)
        }
    }
}
