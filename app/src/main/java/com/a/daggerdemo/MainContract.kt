package com.a.daggerdemo

/**
 * Created by vihaanverma on 22/03/18.
 */
interface MainContract {

    interface View : BaseView<Presenter> {
    }

    interface Presenter : BasePresenter<View> {

    }
}