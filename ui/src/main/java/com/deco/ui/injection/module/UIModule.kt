package com.deco.ui.injection.module

import com.deco.ui.UiThread
import com.deco.ui.view.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class UiModule{
    @Binds
    abstract fun bindPostExecutionThread(uiThread: UiThread): com.deco.domain.executor.PostExecutionThread

    @ContributesAndroidInjector
    abstract fun contributesMainActivity(): MainActivity

}