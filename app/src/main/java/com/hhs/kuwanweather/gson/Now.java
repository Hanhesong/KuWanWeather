package com.hhs.kuwanweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    public String cloud;
    @SerializedName("cond_code")
    public String condCode;
    @SerializedName("cond_txt")
    public String condText;
    public String fy;
    public String hum;
    public String pcpn;
    public String pres;
    @SerializedName("tmp")
    public String temperature;
    public String vis;
    @SerializedName("wind_deg")
    public String windDeg;
    @SerializedName("wind_dir")
    public String windDir;
    @SerializedName("wind_sc")
    public String windSc;
    @SerializedName("wind_spd")
    public String windSpd;
    public Cond cond;

    public class Cond {
        public String code;
        @SerializedName("txt")
        public String info;

    }

}
