package com.example.lottie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var DELAY : Long = 4700
    private val mHandler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      mToastRunnable.run()
    }


    private fun playAnimation(animationView: LottieAnimationView){
        animationView.clearAnimation()
        animationView.playAnimation()
    }

    private fun reverseAnimation(animationView: LottieAnimationView){
        animationView.clearAnimation()
        animationView.reverseAnimation()
    }

    private val mToastRunnable = object : Runnable {
        override fun run() {

            playAnimation(animation_view1)
            Handler().postDelayed({
                reverseAnimation(animation_view1)
              }, DELAY)
            mHandler.postDelayed(this, DELAY*2)
        }
    }

}
