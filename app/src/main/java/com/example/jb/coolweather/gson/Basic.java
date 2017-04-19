package com.example.jb.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JB on 2017/4/16.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
