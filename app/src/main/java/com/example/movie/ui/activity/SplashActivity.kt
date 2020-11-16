package com.example.movie.ui.activity

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.movie.R
import com.example.movie.base.BaseActivity
import com.example.movie.databinding.ActivitySplashBinding

/**
 *   created by ymy on 2020/11/16
 **/
class SplashActivity:BaseActivity(), ViewPropertyAnimatorListener {

    val contentView: ActivitySplashBinding by lazy {
        baseVew as ActivitySplashBinding
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        contentView.splashImg.post {
            ViewCompat.animate(contentView.splashImg).scaleX(1f).scaleY(1f).alpha(1f).setListener(this).setDuration(2000).start()
        }
    }

    override fun getLayoutId(): Int {return R.layout.activity_splash}

    override fun onAnimationEnd(view: View?) {
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }

    override fun onAnimationCancel(view: View?) {
    }

    override fun onAnimationStart(view: View?) {
    }
}


