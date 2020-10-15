package com.niu.code.common.utils;

import java.util.Random;

public class Utils {
    /**
     * 生成随机的盐
     * @return
     */
    public static String generateSalt(){
        Random r = new Random();
        StringBuilder sb = new StringBuilder(16);
        sb.append(r.nextInt(99999999)).append(r.nextInt(99999999));
        int len = sb.length();
        if (len < 16) {
            for (int i = 0; i < 16 - len; i++) {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}
