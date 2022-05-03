package com.cookandroid.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.view.GravityCompat
import com.cookandroid.navigation.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNavi.setOnClickListener{
            binding.layoutDrawer.openDrawer(GravityCompat.START) //Start: left, END: right
        }
        binding.naviView.setNavigationItemSelectedListener(this)    //네비게이션 메뉴 아이템 클릭 속성 부여
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {    //네비게이션 메뉴 아이템 클릭 시 수행
        when (item.itemId){
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
            R.id.email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.send -> Toast.makeText(applicationContext, "메시지", Toast.LENGTH_SHORT).show()
        }
        binding.layoutDrawer.closeDrawers() //네비게이션 뷰 닫기
        return false
    }


    override fun onBackPressed() {
        if(binding.layoutDrawer.isDrawerOpen(GravityCompat.START))
            binding.layoutDrawer.closeDrawers()
        else
            super.onBackPressed()

    }
}
