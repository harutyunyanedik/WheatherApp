package com.example.edo.weatherapp.interfaces;

import com.example.edo.weatherapp.models.countries_weather.Weather;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiService {

    String WEATHER="group?id=524901,703448,2643743&units=metric&appid=9cddf5a1f2deea923025de8d498fef96";


    @GET(WEATHER)
    Call<Weather> getWeatherInfo();

}
