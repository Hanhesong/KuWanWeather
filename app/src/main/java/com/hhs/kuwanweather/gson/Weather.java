package com.hhs.kuwanweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    private String status;
    private Basic basic;
    private Update update;
    private Now now;
    @SerializedName("daily_forecast")
    private List<Forecast> forecastList;
    private AQI aqi;
    private Suggestion suggestion;
    private String msg;
}
