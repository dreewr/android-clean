package com.deco.cache.dao

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import com.deco.cache.db.user.UserDatabase
import org.junit.After
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment

@RunWith(RobolectricTestRunner::class)
class UserDaoTest {
    @Rule
    @JvmField var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val database = Room.inMemoryDatabaseBuilder(
        RuntimeEnvironment.application.applicationContext,
        UserDatabase::class.java)
        .allowMainThreadQueries()
        .build()

/*    @After
    fun clearDb() {
        database.close()
    }

    @Test
    fun insertUser() {
        val user = DataFactory.makeUserEntity()

        database.userDao().deleteUsers()
        database.userDao().insertUser(user)

        val testObserver = database.userDao().getUser().test()

        testObserver.assertValue { value -> value.id == user.id }

    }

    @Test
    fun removeUser() {
        database.userDao().apply{
            insertUser(DataFactory.makeUserEntity())
            deleteUsers()
            getUser().test().assertEmpty()
        }
    }

    @Test
    fun getUser(){
        database.userDao().apply{
            deleteUsers()
            insertUser(DataFactory.makeUserEntity())
            getUser().test().assertValue { it.name.isNotEmpty() }
        }
    }*/

}