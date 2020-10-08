package com.deco.data.store

import com.deco.data.repository.Remote
import javax.inject.Inject

open class RemoteDataStore @Inject constructor(
        private val remote: Remote
)
    : DataStore {
//    override fun postOptimization(baseUrl: String, token: String, optimization: Optimization): Completable =
//            remote.postOptimization(baseUrl, token, optimization)
//
//    override fun checkPasswords(baseUrl: String, token: String, check: SafeguardCheck):Single<Boolean> =
//            remote.checkPasswords(baseUrl, token, check)
//
//    override fun executeLogin(baseUrl: String, userCredentials: UserCredentials): Observable<UserAuth> =
//            remote.executeLogin(baseUrl, userCredentials)


}