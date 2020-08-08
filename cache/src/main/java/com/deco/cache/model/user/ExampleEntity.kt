package com.deco.cache.model.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.deco.cache.db.user.constants.FavoriteLineConstants

@Entity(tableName = FavoriteLineConstants.TABLE_NAME)
class ExampleEntity (
    @PrimaryKey
    @ColumnInfo(name =  FavoriteLineConstants.COLUMN_COD_LINE)
    val lineCode: String,
    @ColumnInfo(name =  FavoriteLineConstants.COLUMN_NAME_LINE)
    val lineName: String,
    @ColumnInfo(name =  FavoriteLineConstants.COLUMN_CD_COMPANY)
    val companyCode: Int
)