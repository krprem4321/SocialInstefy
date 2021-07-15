package com.dk.instefy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("TAG", "onCreate: Hello Dhiraj")
        val result=add(4,5)
        Log.i("TAG", "add method result = $result")
        
    }
    
    private fun add(a:Int,b:Int):Int{
        return a+b;
    }
}
