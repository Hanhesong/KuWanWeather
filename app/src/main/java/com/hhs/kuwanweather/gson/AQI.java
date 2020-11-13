package com.hhs.kuwanweather.gson;

public class AQI {
    private AQICity city;

    private class AQICity {
        private String aqi;
        private String pm25;
        private String qlty;
    }
}
