package com.hhs.kuwanweather.gson;

import androidx.viewpager.widget.PagerTitleStrip;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("cid")
    private String weatherId;
    private String location;
    @SerializedName("parent_city")
    private String cityName;
    @SerializedName("admin_area")
    private String provinceName;
    @SerializedName("cnty")
    private String countryName;
    private String lat;
    private String lon;
    private String tz;
    @SerializedName("city")
    private String countyName;
    private String id;
    private Update update;
}
