package com.hhs.kuwanweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    private String cloud;
    @SerializedName("cond_code")
    private String condCode;
    @SerializedName("cond_text")
    private String condText;
    private String fy;
    private String hum;
    private String pcpn;
    private String pres;
    @SerializedName("tem")
    private String temperature;
    private String vis;
    @SerializedName("wind_deg")
    private String windDeg;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("wind_sc")
    private String windSc;
    @SerializedName("wind_spd")
    private String windSpd;
    private Cond cond;

    public class Cond {
        private String code;
        @SerializedName("txt")
        private String info;

    }

}
