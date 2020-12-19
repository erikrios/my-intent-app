package io.erikrios.github.myintentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.erikrios.github.myintentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            btnMoveActivity.setOnClickListener {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            btnMoveActivityData.setOnClickListener {
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Erik Rio Setiawan")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 23)
                startActivity(moveWithDataIntent)
            }
        }
    }
}