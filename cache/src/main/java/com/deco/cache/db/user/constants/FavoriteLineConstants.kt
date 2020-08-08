package com.deco.cache.db.user.constants

object FavoriteLineConstants {
    const val TABLE_NAME = "favorite_lines"
    const val COLUMN_COD_LINE = "cod_line"
    const val COLUMN_NAME_LINE = "name_line"
    const val COLUMN_CD_COMPANY = "fk_cd_company"

    const val GET_FAVORITE_LINES = "SELECT * FROM $TABLE_NAME"
    const val DELETE_FAVORITE_LINES = "DELETE FROM $TABLE_NAME"
    const val DELETE_FAVORITE_LINE
            = "DELETE FROM $TABLE_NAME WHERE $COLUMN_COD_LINE = :lineCode"

}