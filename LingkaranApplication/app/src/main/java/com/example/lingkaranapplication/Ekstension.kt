package com.example.lingkaranapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast

fun Context.toas(msg: String){
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}

fun Context.intent(cls: Class<*>){
    startActivity(Intent(this,cls))
}

fun Context.intentData(cls: Class<*>, bundle: Bundle){
    val intent = Intent(this,cls)
    intent.putExtras(bundle)
    startActivity(intent)
}