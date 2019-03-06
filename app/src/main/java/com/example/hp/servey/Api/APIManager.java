package com.example.hp.servey.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 2/8/2019.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class APIManager {

    private static Retrofit retrofitInstance;
    private static Retrofit getInstance(){
        if(retrofitInstance==null){//create
            retrofitInstance = new Retrofit.Builder()
                    .baseUrl("http://stdattendance.com/survey/public/api/moderator/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitInstance;
    }

   public static ApiCalls getAPIs(){
       ApiCalls services = getInstance().create(ApiCalls.class);
        return services;
    }
}
