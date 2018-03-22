package com.testbook.tbapp.android.di

import com.a.daggerdemo.ActivityScoped
import com.a.daggerdemo.BlogExamsModule
import com.a.daggerdemo.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by vihaan on 3/20/18.
 */
@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(BlogExamsModule::class))
    abstract fun mainActivity(): MainActivity

}
