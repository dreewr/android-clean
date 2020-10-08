package com.deco.cache.db.user

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.deco.cache.dao.user.ExampleDao

import com.deco.cache.model.user.ExampleEntity
import javax.inject.Inject

@Database(entities = [ExampleEntity::class], version = 1)
abstract class UserDatabase @Inject constructor() : RoomDatabase() {

    abstract fun exampleDao(): ExampleDao

    companion object {
        private var INSTANCE: UserDatabase? = null
        private val lock = Any()
        fun getInstance(context: Context): UserDatabase {
            if (INSTANCE == null) {
                synchronized(lock) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            UserDatabase::class.java, "example.db"
                        )
                            .build()
                    }
                    return INSTANCE as UserDatabase
                }
            }
            return INSTANCE as UserDatabase
        }
    }
}