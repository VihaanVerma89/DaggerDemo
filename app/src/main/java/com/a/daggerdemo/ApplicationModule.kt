package com.testbook.tbapp.android.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * Created by vihaan on 3/20/18.
 */

@Module
abstract class ApplicationModule{
    //expose Application as an injectable context
    @Binds
    abstract fun bindContext(application: Application):Context
}