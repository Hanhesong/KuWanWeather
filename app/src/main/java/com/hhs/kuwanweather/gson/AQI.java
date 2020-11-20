package com.hhs.kuwanweather.gson;

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
        public String qlty;
    }
}
