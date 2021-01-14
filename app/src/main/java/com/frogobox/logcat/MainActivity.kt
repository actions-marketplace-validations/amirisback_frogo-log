package com.frogobox.logcat

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogolog.FrogoLog
import com.frogobox.logcat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.apply {

            btnLog.setOnClickListener {

                FrogoLog.d()
                FrogoLog.d("Debug")

            }

        }

    }

}