package com.xiaoerge.littleastroapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiaoerge on 1/4/15.
 */
public class HoroscopeSign {

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
    @SerializedName("Sign")
    private String sign;
    @SerializedName("Weekly_Horoscope")
    private String weekly_Horoscope;
    @SerializedName("Wellness")
    private String wellness;

    public String getCareer() {
        return this.career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getDaily_Horoscope() {
        return this.daily_Horoscope;
    }

    public void setDaily_Horoscope(String daily_Horoscope) {
        this.daily_Horoscope = daily_Horoscope;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getLove() {
        return this.love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getMonthly_Horoscope() {
        return this.monthly_Horoscope;
    }

    public void setMonthly_Horoscope(String monthly_Horoscope) {
        this.monthly_Horoscope = monthly_Horoscope;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getWeekly_Horoscope() {
        return this.weekly_Horoscope;
    }

    public void setWeekly_Horoscope(String weekly_Horoscope) {
        this.weekly_Horoscope = weekly_Horoscope;
    }

    public String getWellness() {
        return this.wellness;
    }

    public void setWellness(String wellness) {
        this.wellness = wellness;
    }

    @Override
    public String toString() {
        return "HoroscopeSign{" +
                "career='" + career + '\'' +
                ", daily_Horoscope='" + daily_Horoscope + '\'' +
                ", icon='" + icon + '\'' +
                ", info='" + info + '\'' +
                ", love='" + love + '\'' +
                ", monthly_Horoscope='" + monthly_Horoscope + '\'' +
                ", sign='" + sign + '\'' +
                ", weekly_Horoscope='" + weekly_Horoscope + '\'' +
                ", wellness='" + wellness + '\'' +
                '}';
    }
}