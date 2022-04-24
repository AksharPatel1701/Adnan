package com.example.adnanexternal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var flage=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signup.setOnClickListener {
            var intent= Intent(this,WelcomeActivity::class.java)
            startActivity(intent)
        }
        btnlogin.setOnClickListener {
            var username=txtuname.text.toString()
            var pss=txtpass.text.toString()
            if(TextUtils.isEmpty(username) || TextUtils.isEmpty(pss))
            {
                Toast.makeText(applicationContext,
                    "Please Enter UserName/Password",
                    Toast.LENGTH_LONG).show()
            }
            else{

                    if (username.equals("Adnan") && pss.equals("Adnan123")) {

                        var preference = getSharedPreferences("MyPref", MODE_PRIVATE)
                        var editor = preference.edit()
                        editor.putString("UserName", "")
                        editor.commit()
                        var intent = Intent(applicationContext, WelcomeActivity::class.java)
                        startActivity(intent)
                        finish()
                        flage=true


                    }



                if (flage==false)
                {
                    Toast.makeText(this,"invalid username password",Toast.LENGTH_SHORT).show()
                }

            }
        }

    }
}