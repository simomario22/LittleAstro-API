/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiaoerge.littleastroapi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xiaoerge
 */
public class ZodiacSigns
{
    private List<ZodiacSign> signs = new ArrayList<>();

    private class ZodiacSign {

        private String daily_Zodiac;
        private String icon;
        private String info;
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
}
