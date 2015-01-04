package com.xiaoerge.littleastroapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiaoerge on 1/4/15.
 */
public abstract class AstroSign
{
    @SerializedName("Sign")
    private String sign;

    @SerializedName("Career")
    private String career;
    @SerializedName("Daily_Horoscope")
    private String daily_Horoscope;
    @SerializedName("Icon")
    private String icon;
    @SerializedName("Info")
    private String info;
    @SerializedName("Love")
    private String love;
    @SerializedName("Monthly_Horoscope")
    private String monthly_Horoscope;

    @SerializedName("Weekly_Horoscope")
    private String weekly_Horoscope;
    @SerializedName("Wellness")
    private String wellness;
}
