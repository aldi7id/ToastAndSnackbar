package com.ajgroup.toastandsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ajgroup.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "Ini Toast", Toast.LENGTH_SHORT).show()
        }
        binding.btnSnackbar.setOnClickListener {
            Snackbar.make(binding.root, "Ini Snackbar", Snackbar.LENGTH_LONG)
                .setAction("OKE") { }
                .show()
        }
    }
}