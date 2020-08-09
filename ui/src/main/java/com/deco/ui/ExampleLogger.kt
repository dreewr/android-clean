package com.deco.ui

import android.util.Log
import javax.inject.Inject

class ExampleLogger @Inject constructor() {
    fun log(message: String) {
        Log.i(" ", message)
    }
}