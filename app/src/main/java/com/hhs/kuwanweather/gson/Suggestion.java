package com.hhs.kuwanweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    private Comfort comfort;
    private Sport sport;
    @SerializedName("cw")
    private CarWash carWash;


    public class Comfort {
        private String type;
        private String brf;
        @SerializedName("txt")
        private String info;

    }

    public class Sport {
        private String type;
        private String brf;
        @SerializedName("txt")
        private String info;
    }

    public class CarWash {
        private String type;
        private String brf;
        @SerializedName("txt")
        private String info;
    }
}
