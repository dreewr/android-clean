package com.deco.ui.injection.module

import com.deco.data.DataRepository
import com.deco.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
abstract class DataModule {
    @Binds
    abstract fun bindDataRepository(dataRepository: DataRepository): Repository
}
