package com.deco.ui.injection.module

import com.deco.data.repository.Remote
import com.deco.remote.RemoteImpl
import com.deco.remote.service.RetrofitService
import com.deco.remote.service.RetrofitServiceFactory
import dagger.Binds
import dagger.Module
import dagger.Provides
import io.reactivex.android.BuildConfig

@Module
abstract class RemoteModule {

    @Module
    companion object {

        @Provides
        @JvmStatic
        fun provideService(): RetrofitService {
            return RetrofitServiceFactory.makeRetrofitService(BuildConfig.DEBUG)
        }

    }

    @Binds
    abstract fun bindProjectsRemote(projectsRemote: RemoteImpl): Remote
}

