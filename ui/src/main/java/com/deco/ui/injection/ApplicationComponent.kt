package com.deco.ui.injection

import android.app.Application
import com.deco.ui.AppApplication
import com.deco.ui.injection.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule


import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, UiModule::class, ApplicationModule::class,
    PresentationModule::class, DataModule::class, RemoteModule::class, CacheModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(app: AppApplication)

}
