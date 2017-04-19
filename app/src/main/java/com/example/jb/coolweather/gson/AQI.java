package com.example.jb.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JB on 2017/4/16.
 */

public class AQI {

    @SerializedName("city")
    public AQICity city;

    public class AQICity{

        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
