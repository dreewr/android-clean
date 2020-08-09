package com.deco.ui.injection.module

import com.deco.data.repository.Remote
import com.deco.remote.RemoteImpl
import com.deco.remote.service.RetrofitService
import com.deco.remote.service.RetrofitServiceFactory
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import io.reactivex.android.BuildConfig

@InstallIn(FragmentComponent::class)
@Module
abstract class TestModule {

    companion object {
        @Provides
        fun provideService(): RetrofitService {
            return RetrofitServiceFactory.makeRetrofitService(BuildConfig.DEBUG)
        }

    }

    @Binds
    abstract fun bindProjectsRemote(projectsRemote: RemoteImpl): Remote
}

