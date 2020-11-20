package com.hhs.kuwanweather.gson;

import androidx.viewpager.widget.PagerTitleStrip;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("cid")
    public String weatherId;
    public String location;
    @SerializedName("parent_city")
    public String cityName;
    @SerializedName("admin_area")
    public String provinceName;
    @SerializedName("cnty")
    public String countryName;
    public String lat;
    public String lon;
    public String tz;
    @SerializedName("city")
    public String countyName;
    public String id;
    public Update update;
}
