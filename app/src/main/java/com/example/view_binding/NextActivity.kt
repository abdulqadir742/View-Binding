package com.example.view_binding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.view_binding.databinding.ActivityNextBinding


class NextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        val intent = getIntent()
        var Rname = intent.getStringExtra("name")
        var email = intent.getStringExtra("email")
        var address = intent.getStringExtra("address")
        var contact = intent.getStringExtra("contact")

        binding.name.setText(Rname)
        binding.email.setText(email)
        binding.address.setText(address)
        binding.contact.setText(contact)
    }
}