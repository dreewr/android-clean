package com.deco.ui.injection.module

import android.app.Application
import com.deco.cache.CacheImpl
import com.deco.cache.db.user.UserDatabase
import com.deco.data.repository.Cache
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class CacheModule {

    @Module
    companion object {

        @Singleton
        @JvmStatic
        @Provides
        fun getUserDatabase(application: Application): UserDatabase {
            return UserDatabase.getInstance(application)
        }

    }

    @Binds
    abstract fun bindCache(cache: CacheImpl): Cache
}
