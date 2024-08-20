package com.example.restaurant_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.restaurant_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val fragHost = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        navController = fragHost.navController
        setupWithNavController(binding.BottomNavBar, navController)
        binding.floatingActionButton.setOnClickListener {


            val phoneNumber = "tel:01276369336" // Replace with the phone number you want to dial
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse(phoneNumber)
            startActivity(intent)

        }
    }}




