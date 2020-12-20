package io.erikrios.github.myintentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.erikrios.github.myintentapp.databinding.ActivityMoveForResultBinding

class MoveForResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoveForResultBinding

    companion object {
        const val EXTRA_SELECTED_VALUE = "extra_selected_value"
        const val RESULT_CODE = 110
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveForResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnChoose.setOnClickListener {
            if (binding.rgNumber.checkedRadioButtonId > 0) {
                var value = 0
                when (binding.rgNumber.checkedRadioButtonId) {
                    binding.rb50.id -> value = 50
                    binding.rb100.id -> value = 100
                    binding.rb150.id -> value = 150
                    binding.rb200.id -> value = 200
                }

                val resultIntent = Intent()
                resultIntent.putExtra(EXTRA_SELECTED_VALUE, value)
                setResult(RESULT_CODE, resultIntent)
                finish()
            }
        }
    }
}