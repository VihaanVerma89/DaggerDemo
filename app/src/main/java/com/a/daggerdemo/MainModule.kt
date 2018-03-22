package com.a.daggerdemo

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by vihaan on 3/21/18.
 */
@Module
abstract class MainModule {

//    @FragmentScoped
//    @ContributesAndroidInjector
//    abstract fun blogExamsFragment(): MainFragment

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment

    @ActivityScoped
    @Binds
    abstract fun mainPresenter(presenter: MainPresenter): MainContract.Presenter

//    @ActivityScoped
//    @Binds abstract fun blogExamsPresenter(presenter: BlogExamsPresenter): BlogExamsContract.Presenter

//    @ActivityScoped
//    @Binds
//    internal abstract fun taskPresenter(presenter: TasksPresenter): TasksContract.Presenter
}