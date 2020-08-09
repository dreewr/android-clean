package com.deco.ui.injection.module

import com.deco.ui.UiThread
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent


@InstallIn(ApplicationComponent::class)
@Module
abstract class UiModule{
    @Binds
    abstract fun bindPostExecutionThread(uiThread: UiThread): com.deco.domain.executor.PostExecutionThread

}