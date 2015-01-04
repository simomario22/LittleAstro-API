package com.xiaoerge.littleastroapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiaoerge on 1/4/15.
 */
public class HoroscopeSign
{
    @SerializedName("Sign")
    private String sign;
    @SerializedName("Icon")
    private String icon;
    @SerializedName("Info")
    private String info;

    @SerializedName("Daily_Horoscope")
    private String daily_Horoscope;
    @SerializedName("Weekly_Horoscope")
    private String weekly_Horoscope;
    @SerializedName("Monthly_Horoscope")
    private String monthly_Horoscope;

    @SerializedName("Love")
    private String love;
    @SerializedName("Career")
    private String career;
    @SerializedName("Wellness")
    private String wellness;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDaily_Horoscope() {
        return daily_Horoscope;
    }

    public void setDaily_Horoscope(String daily_Horoscope) {
        this.daily_Horoscope = daily_Horoscope;
    }

    public String getWeekly_Horoscope() {
        return weekly_Horoscope;
    }

    public void setWeekly_Horoscope(String weekly_Horoscope) {
        this.weekly_Horoscope = weekly_Horoscope;
    }

    public String getMonthly_Horoscope() {
        return monthly_Horoscope;
    }

    public void setMonthly_Horoscope(String monthly_Horoscope) {
        this.monthly_Horoscope = monthly_Horoscope;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getWellness() {
        return wellness;
    }

    public void setWellness(String wellness) {
        this.wellness = wellness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HoroscopeSign that = (HoroscopeSign) o;

        if (!sign.equals(that.getSign())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return sign.hashCode();
    }

    @Override
    public String toString() {
        return "HoroscopeSign{" +
                "sign='" + sign + '\'' +
                ", icon='" + icon + '\'' +
                ", info='" + info + '\'' +
                ", daily_Horoscope='" + daily_Horoscope + '\'' +
                ", weekly_Horoscope='" + weekly_Horoscope + '\'' +
                ", monthly_Horoscope='" + monthly_Horoscope + '\'' +
                ", love='" + love + '\'' +
                ", career='" + career + '\'' +
                ", wellness='" + wellness + '\'' +
                '}';
    }
}
