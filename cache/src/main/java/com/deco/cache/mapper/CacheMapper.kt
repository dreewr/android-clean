package com.deco.cache.mapper

interface CacheMapper<C, M> {
    fun mapFromCached(cached: C): M
    fun mapToCached(model: M): C
}