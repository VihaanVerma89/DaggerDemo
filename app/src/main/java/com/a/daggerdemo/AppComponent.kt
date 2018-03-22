package com.testbook.tbapp.android.di

import android.app.Application
import com.a.daggerdemo.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by vihaan on 3/20/18.
 */


@Singleton
@Component(modules = arrayOf(
        NetworkModule::class,
        ApplicationModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class
        ))
interface AppComponent : AndroidInjector<App> {

    // Gives us syntactic sugar. we can then do DaggerAppComponent.builder().application(this).build().inject(this);
    // never having to instantiate any modules or say which module we are passing the application to.
    // Application will just be provided into our app graph now.
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }
}

