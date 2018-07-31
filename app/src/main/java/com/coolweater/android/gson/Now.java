package com.coolweater.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tianyj on 7/24/18.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
