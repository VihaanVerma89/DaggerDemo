package com.testbook.tbapp.android.di


import com.a.daggerdemo.BlogExamsService
import com.a.daggerdemo.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by vihaan on 3/20/18.
 */

@Module
class NetworkModule {

    @Provides
    @Singleton
    internal fun provideOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder();
        if (BuildConfig.DEBUG) {
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            builder.addInterceptor(interceptor).build()
        }
        return builder.build()
    }

    @Singleton
    @Provides
    internal fun provideRetrofit(client: OkHttpClient): Retrofit {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://testbook.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();
        return retrofit
    }

    @Singleton
    @Provides
    internal fun provideBlogExamsService(retrofit: Retrofit): BlogExamsService
    {
        val blogExamsService = retrofit.create(BlogExamsService::class.java)
        return blogExamsService
    }


}