package com.a.daggerdemo

import javax.inject.Inject

/**
 * Created by vihaanverma on 22/03/18.
 */

@ActivityScoped
class MainPresenter @Inject constructor(): MainContract.Presenter{
    override fun takeView(view: MainContract.View) {
    }

    override fun dropView() {
    }

}