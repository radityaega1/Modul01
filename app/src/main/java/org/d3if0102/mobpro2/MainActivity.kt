package org.d3if0102.mobpro2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if0102.mobpro2.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.HelloWorldd.text="Hello Worlddd"
    }
}