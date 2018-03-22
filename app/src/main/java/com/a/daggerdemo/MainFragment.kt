package com.a.daggerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import javax.inject.Inject

/**
 * Created by vihaanverma on 22/03/18.
 */
@ActivityScoped
class MainFragment @Inject constructor(): DaggerFragment() , MainContract.View{

    companion object {
//        fun newInstance(bundle: Bundle) = MainFragment().apply { arguments = bundle }
        fun newInstance() = MainFragment()
    }


    @Inject
    lateinit var mainPresenter: MainContract.Presenter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater?.inflate(R.layout.fragment_main, container, false);
        return root;
    }
}