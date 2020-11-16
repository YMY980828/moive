package com.example.movie.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.movie.R
import kotlinx.android.synthetic.main.activity_splash.view.*
import org.jetbrains.anko.toast

/**
 *   created by ymy on 2020/11/16
 *   所有activity的基类
 *
 *
 **/
abstract class BaseActivity: AppCompatActivity()  {
    var TAG :String =this.javaClass.name
    lateinit  var baseVew : ViewDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       baseVew = DataBindingUtil.setContentView<ViewDataBinding>(this, getLayoutId())
        //   setContentView(getLayoutId())

    }


    abstract fun getLayoutId():Int
    protected fun showToast(s:String){
        runOnUiThread{
            toast(s)
        }
    }


}