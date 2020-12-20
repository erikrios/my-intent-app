package io.erikrios.github.myintentapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.erikrios.github.myintentapp.databinding.ActivityMoveForResultBinding

class MoveForResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoveForResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveForResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}