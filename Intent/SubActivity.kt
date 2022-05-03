package com.cookandroid.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cookandroid.textviewkt.databinding.ActivityMainBinding
import com.cookandroid.textviewkt.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra("msg")){
            binding.tvGetText.setText(intent.getStringExtra("msg"))
        }
    }
}
