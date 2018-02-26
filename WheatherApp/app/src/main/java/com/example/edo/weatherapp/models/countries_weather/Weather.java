package com.example.edo.weatherapp.models.countries_weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Weather {
    @SerializedName("cnt")
    @Expose
    private int cnt;
    @SerializedName("list")
    @Expose
    private java.util.List<WeatherList> list = null;

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public java.util.List<WeatherList> getList() {
        return list;
    }

    public void setList(java.util.List<WeatherList> list) {
        this.list = list;
    }
}
