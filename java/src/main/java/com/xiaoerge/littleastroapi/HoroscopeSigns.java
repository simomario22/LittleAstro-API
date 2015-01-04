package com.xiaoerge.littleastroapi;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoerge on 1/4/15.
 */
public class HoroscopeSigns {
    public List<HoroscopeSign> signs = new ArrayList<>();

    private HoroscopeSigns() throws ConfigurationException, IOException {
        PropertiesConfiguration configs = new PropertiesConfiguration("app.properties");

        String horoscopeRest = configs.getString("app.horoscope.rest.get");

        HttpURLConnection con = (HttpURLConnection)
                new URL(horoscopeRest).openConnection();
        con.setRequestProperty("User-Agent", "LittleAstro-API");

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String jstring = reader.readLine();

        Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        JsonArray jArray = parser.parse(jstring).getAsJsonArray();

        List<HoroscopeSign> signs = new ArrayList<HoroscopeSign>();

        for (JsonElement obj : jArray) {
            HoroscopeSign sign = gson.fromJson(obj, HoroscopeSign.class);
            signs.add(sign);
        }
    }

    private class HoroscopeSign {

        private String career;
        private String daily_Horoscope;
        private String icon;
        private String info;
        private String love;
        private String monthly_Horoscope;
        private String sign;
        private String weekly_Horoscope;
        private String wellness;

        protected String getCareer() {
            return this.career;
        }

        protected void setCareer(String career) {
            this.career = career;
        }

        protected String getDaily_Horoscope() {
            return this.daily_Horoscope;
        }

        protected void setDaily_Horoscope(String daily_Horoscope) {
            this.daily_Horoscope = daily_Horoscope;
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

        protected String getLove() {
            return this.love;
        }

        protected void setLove(String love) {
            this.love = love;
        }

        protected String getMonthly_Horoscope() {
            return this.monthly_Horoscope;
        }

        protected void setMonthly_Horoscope(String monthly_Horoscope) {
            this.monthly_Horoscope = monthly_Horoscope;
        }

        protected String getSign() {
            return this.sign;
        }

        protected void setSign(String sign) {
            this.sign = sign;
        }

        protected String getWeekly_Horoscope() {
            return this.weekly_Horoscope;
        }

        protected void setWeekly_Horoscope(String weekly_Horoscope) {
            this.weekly_Horoscope = weekly_Horoscope;
        }

        protected String getWellness() {
            return this.wellness;
        }

        protected void setWellness(String wellness) {
            this.wellness = wellness;
        }
    }
}
