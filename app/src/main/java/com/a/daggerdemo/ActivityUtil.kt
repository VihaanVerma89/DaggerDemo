package com.a.daggerdemo

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity

/**
 * Created by vihaan on 3/17/18.
 */

fun AppCompatActivity.showFragment(id: Int, fragment: Fragment) {
    supportFragmentManager.transact {
        replace(id, fragment)
    }
}

private inline fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
    beginTransaction().apply {
        action()
    }.commit()
}