package io.erikrios.github.myintentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.erikrios.github.myintentapp.databinding.ActivityMainBinding
import io.erikrios.github.myintentapp.models.Person

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
            btnMoveActivityObject.setOnClickListener {
                val person =
                    Person("Erik Rio Setiawan", 23, "erikriosetiawan15@gmail.com", "Ponorogo")
                val moveWithObjectIntent =
                    Intent(this@MainActivity, MoveWithObjectActivity::class.java)
                moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                startActivity(moveWithObjectIntent)
            }
        }
    }
}