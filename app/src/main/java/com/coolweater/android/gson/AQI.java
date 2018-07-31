package com.coolweater.android.gson;

import java.security.PublicKey;

/**
 * Created by tianyj on 7/24/18.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
