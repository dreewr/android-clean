package com.deco.data.store

import javax.inject.Inject

open class DataStoreFactory @Inject constructor(
        private val remoteDataStore: RemoteDataStore
) {

    open fun getDataStore(): DataStore {

        return remoteDataStore
    }
}