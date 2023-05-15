package com.example.firstapplication


import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

lateinit var welcomeText: String
lateinit var tvWelcome: TextView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        welcomeText ="Welcome "+ getIntent().getStringExtra("username").toString() + "!"
        tvWelcome = this.findViewById(R.id.tvWelcome)
        tvWelcome.setText(welcomeText)
    }
}