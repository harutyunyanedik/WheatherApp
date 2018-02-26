package com.example.edo.weatherapp.webmanager;

import com.example.edo.weatherapp.interfaces.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class MyHttpClient {

    public static String BASE_URL="http://samples.openweathermap.org/data/2.5/";

    public static ApiService apiCallBack(){
        Retrofit builder = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = builder.create(ApiService.class);

        return apiService;
    }
}
