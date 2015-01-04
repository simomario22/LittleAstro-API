package com.xiaoerge.littleastroapi;

import com.xiaoerge.littleastroapi.model.HoroscopeSign;
import com.xiaoerge.littleastroapi.reading.HoroscopeReadings;
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

        HoroscopeSign aries = horoscopeReadings.getSigns().get(0);

    }
}
