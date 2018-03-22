package com.a.daggerdemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by vihaanverma on 22/03/18.
 */
class MainFragment : Fragment() {

    companion object {
//        fun newInstance(bundle: Bundle) = MainFragment().apply { arguments = bundle }
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater?.inflate(R.layout.fragment_main, container, false);
        return root;
    }
}