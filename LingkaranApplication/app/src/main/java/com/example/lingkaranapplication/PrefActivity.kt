package com.example.lingkaranapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_pref.*

class PrefActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pref)
        val bundle = intent.extras
        var a = bundle?.getString("name")

        tv_pref.setText(a)
        bt_luas.setOnClickListener {
            val bandel = Bundle()
            bandel.putString("name",a)
            intentData(LuasActivity::class.java,bandel) }
        bt_keliling.setOnClickListener {
            val bandel = Bundle()
            bandel.putString("name",a)
            intentData(KelilingActivity::class.java,bandel) }
    }
}
