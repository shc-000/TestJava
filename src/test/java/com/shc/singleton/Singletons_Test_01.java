package com.shc.singleton;
/**
 * @author shc
 * ²âÊÔµ¥ÀýÄ£Ê½
 */
public class Singletons_Test_01 {
	public static void main(String[] args) {
		Singleton01 s1 = Singleton01.getInstance();
		Singleton01 s2 = Singleton01.getInstance();
		System.out.println(s1==s2);
		
		Singleton02 s3 = Singleton02.getInstance();
		Singleton02 s4 = Singleton02.getInstance();
		System.out.println(s3==s4);
		
		Singleton03 s5 = Singleton03.getInstance();
		Singleton03 s6 = Singleton03.getInstance();
		System.out.println(s5==s6);
		
		System.out.println(Singleton04.INSTANCE==Singleton04.INSTANCE);
	}
	
}
