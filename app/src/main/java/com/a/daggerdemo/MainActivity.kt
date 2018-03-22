package com.a.daggerdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()
    }

    private fun initFragment(){
        val fragment = supportFragmentManager.findFragmentById(R.id.frameLayout)
                as MainFragment? ?: MainFragment.newInstance().also {
            showFragment( R.id.frameLayout, it)
        }
    }
}
