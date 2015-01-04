package com.xiaoerge.littleastroapi.reading;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.xiaoerge.littleastroapi.model.HoroscopeSign;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoerge on 1/4/15.
 */
public class HoroscopeReadings {

    private List<HoroscopeSign> signs;
    private static HoroscopeReadings horoscopeReadings;

    private HoroscopeReadings() throws ConfigurationException, IOException {

        PropertiesConfiguration configs = new PropertiesConfiguration("app.properties");

        String horoscopeRest = configs.getString("app.horoscope.rest.get");

        HttpURLConnection con = (HttpURLConnection)
                new URL(horoscopeRest).openConnection();
        con.setRequestProperty("User-Agent", "LittleAstro-API-Java");

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String jstring = reader.readLine();

        Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        JsonArray jArray = parser.parse(jstring).getAsJsonArray();

        signs = new ArrayList<HoroscopeSign>();

        for (JsonElement obj : jArray) {
            HoroscopeSign sign = gson.fromJson(obj, HoroscopeSign.class);
            signs.add(sign);
        }
    }

    public List<HoroscopeSign> getSigns() {
        return signs;
    }

    public static HoroscopeReadings getInstance()
    {
        if (horoscopeReadings != null)
        {
            return horoscopeReadings;
        }
        else
        {
            try {
                return new HoroscopeReadings();
            }
            catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
