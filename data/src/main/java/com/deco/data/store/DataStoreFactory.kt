package com.deco.data.store

import javax.inject.Inject

open class DataStoreFactory @Inject constructor(
        private val remoteDataStore: RemoteDataStore,
        private val cacheDataStore: CacheDataStore
) {
    open fun getDataStore() = remoteDataStore
    open fun getCacheStore() = cacheDataStore
}