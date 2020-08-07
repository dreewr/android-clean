package com.deco.data

import com.deco.data.store.DataStoreFactory
import com.deco.domain.Repository
import javax.inject.Inject

class DataRepository @Inject constructor(
    private val factory: DataStoreFactory
): Repository
