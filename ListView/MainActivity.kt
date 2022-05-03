package com.cookandroid.textviewkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.cookandroid.textviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var UserList= arrayListOf<User>(
        User(R.drawable.android, "hyemzzi", "23", "안녕하세요"),
        User(R.drawable.android, "hey", "20", "안녕하세요"),
        User(R.drawable.android, "gabi", "21", "안녕하세요"),
        User(R.drawable.android, "jason", "19", "안녕하세요"),
        User(R.drawable.android, "john", "26", "안녕하세요"),
        User(R.drawable.android, "luna", "25", "안녕하세요"),
        User(R.drawable.android, "moon", "29", "안녕하세요"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val item= arrayOf("사과", "배", "딸기", "수박","참외")   //배열 생성
//        binding.listVIew.adapter=ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter=UserAdapter(this,UserList)
        binding.listView.adapter=Adapter

        binding.listView.onItemClickListener= AdapterView.OnItemClickListener{ parent, view, position, id->
            val selectItem=parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }

    }
}
