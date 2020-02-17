package com.example.lingkaranapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        bt_inten_home.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", et_name.text.toString())
            intentData(PrefActivity::class.java,bundle)}
    }
}
