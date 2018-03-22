package com.a.daggerdemo

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by vihaan on 3/21/18.
 */
@Module
abstract class BlogExamsModule {

//    @FragmentScoped
//    @ContributesAndroidInjector
//    abstract fun blogExamsFragment(): MainFragment

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun blogsFragment():MainFragment

//    @ActivityScoped
//    @Binds abstract fun blogExamsPresenter(presenter: BlogExamsPresenter): BlogExamsContract.Presenter

//    @ActivityScoped
//    @Binds
//    internal abstract fun taskPresenter(presenter: TasksPresenter): TasksContract.Presenter
}