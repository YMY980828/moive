package com.example.movie.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movie.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    external fun stringFromJNI(): String

    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }


}
