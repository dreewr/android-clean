package com.deco.ui

import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject
import io.reactivex.Scheduler

class UiThread @Inject constructor():
    com.deco.domain.executor.PostExecutionThread {

    override val scheduler: Scheduler
        get() = AndroidSchedulers.mainThread()
}