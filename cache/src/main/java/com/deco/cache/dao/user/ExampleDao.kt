package com.deco.cache.dao.user

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.deco.cache.db.user.constants.FavoriteLineConstants
import com.deco.cache.model.user.ExampleEntity
import io.reactivex.Observable

@Dao
abstract  class ExampleDao {
    @Query(FavoriteLineConstants.GET_FAVORITE_LINES)
    abstract fun getFavoriteLines(): Observable<List<ExampleEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertFavoriteLine(example: ExampleEntity)

    @Query(FavoriteLineConstants.DELETE_FAVORITE_LINES)
    abstract fun deleteFavoriteLines()

    @Query(FavoriteLineConstants.DELETE_FAVORITE_LINE)
    abstract fun deleteFavoriteLine(lineCode: String)

}

