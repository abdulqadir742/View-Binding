package com.example.view_binding

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.view_binding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)


        binding.btn.setOnClickListener{
            var Rname = binding.Rname.text.toString()
            var Remail = binding.Remail.text.toString()
            var Raddress = binding.Raddress.text.toString()
            var Rcon = binding.Rcontact.text.toString()

            val intent = Intent(this, NextActivity::class.java)
            intent.putExtra("name",Rname)
            intent.putExtra("email",Remail)
            intent.putExtra("address",Raddress)
            intent.putExtra("contact",Rcon)
            startActivity(intent)


        }




    }


}