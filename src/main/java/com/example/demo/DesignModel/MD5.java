package com.example.demo.DesignModel;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author spnooyseed
 * Date on 2021/1/8  14:01
 */

public class MD5 {
        public String md5(String content) {
            byte[] hash;
            try {
                hash = MessageDigest.getInstance("MD5").digest(content.getBytes());

                StringBuilder hex = new StringBuilder(hash.length * 2);
                for (byte b : hash) {
                    if ((b & 0xFF) < 0x10){
                        hex.append("0");
                    }
                    hex.append(Integer.toHexString(b & 0xFF));
                }
                return hex.toString();

            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("NoSuchAlgorithmException",e);
            }
        }

}
