package com.hhs.kuwanweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    private String date;
    @SerializedName("cond")
    private More more;
    @SerializedName("tmp")
    private Temperature temperature;

    public class More {
        @SerializedName("txt_d")
        private String info;
    }

    private class Temperature {
        private String max;
        private String min;
    }
}
