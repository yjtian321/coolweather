package com.coolweater.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tianyj on 7/24/18.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
