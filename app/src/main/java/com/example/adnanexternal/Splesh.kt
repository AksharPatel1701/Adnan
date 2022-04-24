package com.example.adnanexternal

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splesh.*

class Splesh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splesh)

        var sp : SharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE)
        var st = sp.getString("UserName","")

        Handler().postDelayed({
            if(st.equals(""))
            {
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                var intent = Intent(this,WelcomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        },5000)
    }

}