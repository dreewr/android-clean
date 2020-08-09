package com.deco.ui

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class AppApplication  : Application(){

    /*INJECTION EXAMPLE*/
    @Inject lateinit var logger: ExampleLogger

    override fun onCreate() {
        super.onCreate() // Injection takes place here
        logger.log("Initializing component")
    }


}



