package com.xiaoerge.littleastroapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiaoerge on 1/4/15.
 */
public class ZodiacSign {

    @SerializedName("Daily_Zodiac")
    private String daily_Zodiac;
    @SerializedName("Icon")
    private String icon;
    @SerializedName("Info")
    private String info;
    @SerializedName("Sign")
    private String sign;

    protected String getDaily_Zodiac() {
        return this.daily_Zodiac;
    }

    protected void setDaily_Zodiac(String daily_Zodiac) {
        this.daily_Zodiac = daily_Zodiac;
    }

    protected String getIcon() {
        return this.icon;
    }

    protected void setIcon(String icon) {
        this.icon = icon;
    }

    protected String getInfo() {
        return this.info;
    }

    protected void setInfo(String info) {
        this.info = info;
    }

    protected String getSign() {
        return this.sign;
    }

    protected void setSign(String sign) {
        this.sign = sign;
    }
}