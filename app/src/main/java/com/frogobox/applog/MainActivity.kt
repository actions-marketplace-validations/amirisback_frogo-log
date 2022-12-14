package com.frogobox.applog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.applog.databinding.ActivityMainBinding
import com.frogobox.frogolog.FLog
import com.frogobox.frogolog.FrogoLog

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {

            btnFlog.setOnClickListener {
                // Regular No Toast
                FLog.d("Debug")
                FLog.i("Info")
                FLog.v("Verbose")
                FLog.w("Warn")
                FLog.e("Error")
                FLog.d()
            }

            btnFlogToast.setOnClickListener {
                // Regular with Toast
                FLog.d("Debug", this@MainActivity)
                FLog.i("Info", this@MainActivity)
                FLog.v("Verbose", this@MainActivity)
                FLog.w("Warn", this@MainActivity)
                FLog.e("Error", this@MainActivity)
                FLog.d()
            }

            btnFrogolog.setOnClickListener {
                // Line Number and No Toast
                FrogoLog.d("Debug")
                FrogoLog.i("Info")
                FrogoLog.v("Verbose")
                FrogoLog.w("Warn")
                FrogoLog.e("Error")
                FrogoLog.d()
            }

            btnFrogologToast.setOnClickListener {
                // Line Numbar with Toast
                FrogoLog.d("Debug", this@MainActivity)
                FrogoLog.i("Info", this@MainActivity)
                FrogoLog.v("Verbose", this@MainActivity)
                FrogoLog.w("Warn", this@MainActivity)
                FrogoLog.e("Error", this@MainActivity)
                FrogoLog.d(this@MainActivity)
            }

        }

    }

}