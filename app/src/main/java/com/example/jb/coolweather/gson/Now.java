package com.example.jb.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JB on 2017/4/16.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
