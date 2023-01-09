package com.diwa.marketplace.utils

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class Preferences(activity: Activity) {

//    private val login = "login"

    var sharedPref: SharedPreferences = activity.getSharedPreferences("MYPREFF",
        Context.MODE_PRIVATE)

    fun setIsLogin(key: String, value: Boolean) {
        sharedPref.edit()
            .putBoolean(key, value)
            .apply()
    }

    fun getIsLogin(key: String): Boolean {
        return sharedPref.getBoolean(key, false)
    }
}