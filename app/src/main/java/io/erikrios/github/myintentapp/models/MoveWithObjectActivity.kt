package io.erikrios.github.myintentapp.models

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.erikrios.github.myintentapp.databinding.ActivityMoveWithObjectBinding

class MoveWithObjectActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoveWithObjectBinding

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveWithObjectBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person
        val text =
            "Name : ${person.name.toString()},\nEmail : ${person.email.toString()},\nAge : ${person.age},\nLocation : ${person.city}"
        binding.tvObjectReceived.text = text
    }
}