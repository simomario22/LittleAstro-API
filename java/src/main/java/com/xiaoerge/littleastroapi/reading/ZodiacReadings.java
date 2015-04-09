/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiaoerge.littleastroapi.reading;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.xiaoerge.littleastroapi.misc.AstroEnum;
import com.xiaoerge.littleastroapi.misc.InvalidEnumException;
import com.xiaoerge.littleastroapi.model.HoroscopeSign;
import com.xiaoerge.littleastroapi.model.ZodiacSign;
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
 *
 * @author xiaoerge
 */
public class ZodiacReadings
{
    private List<ZodiacSign> signs;
    private static ZodiacReadings zodiacReadings;

    private ZodiacReadings() throws ConfigurationException, IOException {

        PropertiesConfiguration configs = new PropertiesConfiguration("app.properties");

        String horoscopeRest = configs.getString("app.zodiac.rest.get");

        HttpURLConnection con = (HttpURLConnection)
                new URL(horoscopeRest).openConnection();
        con.setRequestProperty("User-Agent", "LittleAstro-API-Java");

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String jstring = reader.readLine();

        Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        JsonArray jArray = parser.parse(jstring).getAsJsonArray();

        signs = new ArrayList<ZodiacSign>();

        for (JsonElement obj : jArray) {
            ZodiacSign sign = gson.fromJson(obj, ZodiacSign.class);
            signs.add(sign);
        }
    }

    public ZodiacSign getSign(AstroEnum c) throws InvalidEnumException {
        if (c.ordinal() < 12) {
            throw new InvalidEnumException(c.toString() + " is not a valid sign for");
        }
        else {
            return signs.get(c.ordinal()-12);
        }
    }

    public static ZodiacReadings getInstance()
    {
        if (zodiacReadings != null)
        {
            return zodiacReadings;
        }
        else
        {
            try {
                return new ZodiacReadings();
            }
            catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
