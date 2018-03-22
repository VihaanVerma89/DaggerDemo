package com.a.daggerdemo

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()
    }

    @Inject
    lateinit var mainPresenter: MainContract.Presenter

    @Inject
    lateinit var mainFragmentProvider: dagger.Lazy<MainFragment>

//    @Inject
//    internal var blogExamsFragmentProvider: dagger.Lazy<BlogExamsFragment>? = null

    private fun initFragment(){
        val fragment = supportFragmentManager.findFragmentById(R.id.frameLayout)
                as MainFragment? ?: mainFragmentProvider.get().apply {
            showFragment(R.id.frameLayout, this)
        }
    }
}
