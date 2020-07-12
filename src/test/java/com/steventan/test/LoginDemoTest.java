package com.steventan.test;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author TanXY
 * @create 2020/7/12 - 10:19
 */
class LoginDemoTest {
    @Test
    void test(){
        String str="abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i < 6;i++){
            int number = random.nextInt(36);
            sb.append(str.charAt(number));
        }
        System.out.println(sb.toString());
    }
}
