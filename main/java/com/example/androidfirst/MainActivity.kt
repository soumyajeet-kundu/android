package com.example.androidfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClick.setOnClickListener{
            var un = editTextTextPersonName.text.toString()
            var pass = editTextTextPassword.text.toString()
            var uname:String? = "soumya"
            var password:String? = "123"

            if(un.equals(uname)  && pass.equals(password))
            {
                var intentHere = Intent(this,MainActivity2::class.java)
                startActivity(intentHere)
            }
//            var IntentHere = Intent(this, MainActivity2::class.java)
//            startActivity(IntentHere)
            else{
            Toast.makeText(this, "Username/Password Incorrect", Toast.LENGTH_LONG).show()
            }
        }


    }
}