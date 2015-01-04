package com.xiaoerge.littleastroapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiaoerge on 1/4/15.
 */
public class ZodiacSign {

    @SerializedName("Sign")
    private String sign;
    @SerializedName("Icon")
    private String icon;
    @SerializedName("Info")
    private String info;

    @SerializedName("Daily_Zodiac")
    private String daily_Zodiac;

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

    public String getDaily_Zodiac() {
        return daily_Zodiac;
    }

    public void setDaily_Zodiac(String daily_Zodiac) {
        this.daily_Zodiac = daily_Zodiac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZodiacSign that = (ZodiacSign) o;

        if (!sign.equals(that.getSign())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return sign.hashCode();
    }

    @Override
    public String toString() {
        return "ZodiacSign{" +
                "sign='" + sign + '\'' +
                ", icon='" + icon + '\'' +
                ", info='" + info + '\'' +
                ", daily_Zodiac='" + daily_Zodiac + '\'' +
                '}';
    }
}
