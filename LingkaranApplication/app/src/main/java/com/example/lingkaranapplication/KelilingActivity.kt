package com.example.lingkaranapplication

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_luas.*
import kotlin.random.Random

class KelilingActivity : AppCompatActivity() {
    private var randomInt: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keliling)

        val bundle = intent.extras
        tv_name.setText(bundle?.getString("name"))
        randomInt = Random.nextInt(0,20)
        ib_pop_up.setOnClickListener { openDialog() }
    }

    private fun openDialog() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.input_hasil)
        val lp: WindowManager.LayoutParams = WindowManager.LayoutParams().apply {
            copyFrom(dialog.window?.attributes)
            width = WindowManager.LayoutParams.MATCH_PARENT
            height = WindowManager.LayoutParams.WRAP_CONTENT
        }
        var ramdom = dialog.findViewById<View>(R.id.tv_r) as TextView
        val hasil = dialog.findViewById<View>(R.id.et_result) as EditText
        val buttonResult = dialog.findViewById<View>(R.id.bt_result) as Button
        ramdom.setText(randomInt.toString())
        buttonResult.setOnClickListener { luasLingkaran(randomInt!!,hasil.text.toString().toInt())
            dialog.dismiss()}
        dialog.show()
        dialog.getWindow()?.setAttributes(lp)
    }

    private fun luasLingkaran(jari: Int, nilai: Int){
        var hasil = 2 * 22/7 *jari
        if (hasil == nilai) tv_hasil.setText("Benar") else tv_hasil.setText("gagal")
    }
}
