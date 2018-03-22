package com.a.daggerdemo

import com.testbook.tbapp.android.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by vihaanverma on 22/03/18.
 */
class App: DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build();
    }
}