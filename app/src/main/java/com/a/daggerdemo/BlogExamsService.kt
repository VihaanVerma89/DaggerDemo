package com.a.daggerdemo

import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by vihaan on 3/16/18.
 */
interface BlogExamsService{
//    @GET("/blog/mobile_blog_api.php?type=1&")
    @GET("/blog/mobile_blog_api.php")
    fun getExams(@Query("type") type: String): Single<ResponseBody>

    @GET("/blog/mobile_blog_api.php")
    fun getExams1(@Query("type") type: String): Single<ResponseBody>
}