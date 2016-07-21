package com.shc.test;

import java.util.Random;

/**
 * @author shc
 * @date 2016-07-01
 * 根据系统时间生成所需位数的随机数
 */
public class RandomUtils {
	public static final String numberChar = "123456789";
	
	public static String getRandom(int num) {
		 
        Long seed = System.currentTimeMillis();// 获得系统时间，作为生成随机数的种子
 
        StringBuffer sb = new StringBuffer();// 装载生成的随机数
 
        Random random = new Random(seed);// 调用种子生成随机数
 
        for (int i = 0; i < num; i++) {
 
            sb.append(numberChar.charAt(random.nextInt(numberChar.length())));
        }
 
        return sb.toString();
 
    }
}
