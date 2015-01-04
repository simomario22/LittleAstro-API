package com.xiaoerge.littleastroapi;

import com.xiaoerge.littleastroapi.model.HoroscopeSign;
import com.xiaoerge.littleastroapi.model.ZodiacSign;
import com.xiaoerge.littleastroapi.reading.HoroscopeReadings;
import com.xiaoerge.littleastroapi.reading.ZodiacReadings;
import org.apache.commons.configuration.ConfigurationException;

import java.io.IOException;

/**
 * Created by xiaoerge on 1/4/15.
 */
public class program
{
    public static void main(String[] args) throws ConfigurationException, IOException
    {
        HoroscopeReadings horoscopeReadings = HoroscopeReadings.getInstance();
        ZodiacReadings zodiacReadings = ZodiacReadings.getInstance();

        HoroscopeSign aries = horoscopeReadings.getSigns().get(0);
        ZodiacSign rat = zodiacReadings.getSigns().get(0);

        System.out.println(aries);
        System.out.println(rat);

        System.out.println(aries.getDaily_Horoscope());
        System.out.println(aries.getLove());
        System.out.println(aries.getWellness());
        System.out.println(rat.getDaily_Zodiac());
    }
}
