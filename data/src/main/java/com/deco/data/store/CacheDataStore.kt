package com.deco.data.store

import com.deco.data.repository.Cache
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

open class CacheDataStore @Inject constructor(
    private val cache: Cache
) : DataStore {

    private fun throwUnsupportedOperationException(): Nothing =
        throw UnsupportedOperationException("This function isn't supported here...")

}