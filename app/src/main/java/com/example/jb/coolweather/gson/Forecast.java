package com.example.jb.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by JB on 2017/4/16.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public  Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;
        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
