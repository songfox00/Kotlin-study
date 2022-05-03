package com.cookandroid.textviewkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cookandroid.textviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            //var: 변경 가능 변수
            //val: 상수

            val intent= Intent(this,SubActivity::class.java)
            intent.putExtra("msg", binding.tvSend.text.toString())
            startActivity(intent)
            //finish() // 자기 자신 액티비티 파괴
        }
    }
}
