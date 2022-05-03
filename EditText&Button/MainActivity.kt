package com.cookandroid.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cookandroid.textviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetText.setOnClickListener {
            var resultText=binding.edId.text.toString() //텍스트를 문자열로 받아옴
            binding.text1.setText(resultText)
        }
    }
}
