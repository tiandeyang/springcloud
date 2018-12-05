package com.dytian.yuemee.common;

import org.apache.logging.log4j.util.Strings;
import org.springframework.cache.CacheManager;

import javax.security.auth.Subject;
import java.math.BigDecimal;
import java.sql.Timestamp;

public final class BurroKit {

    public static String captcha_attr = "burro_captcha";

    public static Timestamp current() {
        return new Timestamp(System.currentTimeMillis());
    }





    public static String filedsRegOf(String... fileds) {
        String temp = "^";
        for (String string : fileds) {
            temp += string;
            temp += "|";
        }
        temp = temp.substring(0, temp.length() - 1);
        temp += "$";
        return temp;
    }



    /**
     * 大于
     * @param a
     * @param b
     * @return
     */
    public static boolean ifAGtB(BigDecimal a, BigDecimal b){
        return a.compareTo(b) > 0;
    }

    /**
     * 大于等于
     * @param a
     * @param b
     * @return
     */
    public static boolean ifAGtOrEqB(BigDecimal a,BigDecimal b){
        return a.compareTo(b) >= 0;
    }


    /**
     * 等于
     * @param a
     * @param b
     * @return
     */
    public static boolean ifAEqB(BigDecimal a,BigDecimal b){
        return a.compareTo(b) == 0;
    }

    /**
     * 小于
     * @param a
     * @param b
     * @return
     */
    public static boolean ifALtB(BigDecimal a,BigDecimal b){
        return a.compareTo(b) < 0;
    }

    /**
     * 小于等于
     * @param a
     * @param b
     * @return
     */
    public static boolean ifALtOrEqB(BigDecimal a,BigDecimal b){
        return a.compareTo(b) <= 0;
    }




}