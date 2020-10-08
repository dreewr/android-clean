package com.deco.cache

import com.deco.data.repository.Cache
import javax.inject.Inject

class CacheImpl @Inject constructor(
    //private val userDatabase: UserDatabase,
    //private val recentPlaceMapper: RecentPlaceCacheMapper,
    //private val userMapper: UserCacheMapper,

    //private val favoriteLineCacheMapper: FavoriteLineCacheMapper
) : Cache {

    /*override fun getFavoriteLines(): Observable<List<Line>> =
        userDatabase.favoriteLineDao().getFavoriteLines().map { cachedLine ->
            cachedLine.map { favoriteLineCacheMapper.mapFromCached(it) }
        }

    override fun insertFavoriteLine(line: Line) = Completable.defer {
        userDatabase.favoriteLineDao().insertFavoriteLine(favoriteLineCacheMapper.mapToCached(line))
        Completable.complete()
    }

    override fun deleteFavoriteLines() = Completable.defer {
        userDatabase.favoriteLineDao().deleteFavoriteLines()
        Completable.complete()
    }*/

}
