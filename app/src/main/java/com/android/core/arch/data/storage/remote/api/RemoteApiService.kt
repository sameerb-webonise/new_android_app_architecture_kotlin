package com.android.core.arch.data.storage.remote.api

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * RemoteApiService class to provide dependency service for remote data
 *
 * @author Rohit Anvekar
 * @since 2019-02-15
 */
class RemoteApiService @Inject
constructor(private val mRetrofit: Retrofit, private val mRemoteApiHelper: RemoteApiHelper) {

    fun getNewsFeed(fileUrl: String): Observable<ResponseBody> {
        return mRemoteApiHelper.getNewsFeed(fileUrl)
    }


}