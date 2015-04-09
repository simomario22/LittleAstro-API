package com.xiaoerge.littleastroapi;

import com.xiaoerge.littleastroapi.misc.AstroEnum;
import com.xiaoerge.littleastroapi.misc.InvalidEnumException;
import com.xiaoerge.littleastroapi.model.HoroscopeSign;
import com.xiaoerge.littleastroapi.model.ZodiacSign;
import com.xiaoerge.littleastroapi.reading.HoroscopeReadings;
import com.xiaoerge.littleastroapi.reading.ZodiacReadings;
import org.apache.commons.configuration.ConfigurationException;

import java.io.IOException;

/**
 * Created by xiaoerge on 1/4/15.
 */
public class Program
{
    public static void main(String[] args) throws ConfigurationException, IOException, InvalidEnumException
    {
        HoroscopeReadings horoscopeReadings = HoroscopeReadings.getInstance();
        ZodiacReadings zodiacReadings = ZodiacReadings.getInstance();

        HoroscopeSign aries = horoscopeReadings.getSign(AstroEnum.Aries);
        ZodiacSign rat = zodiacReadings.getSign(AstroEnum.Rat);

        System.out.println(aries);
        System.out.println(rat);

        System.out.println(aries.getDaily_Horoscope());
        System.out.println(aries.getLove());
        System.out.println(aries.getWellness());
        System.out.println(rat.getDaily_Zodiac());
    }
}
