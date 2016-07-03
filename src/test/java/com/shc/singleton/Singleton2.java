package com.shc.singleton;
/**
 * @author shc
 * 破解懒汉式反射漏洞
 */
public class Singleton2 {
	//1.私有的静态的变量
	private static Singleton2 instance;
	//2.私有的构造器
	private Singleton2(){
		System.out.println(instance);//每次都是null,因为到这里还没有初始化
		if (null != instance) {
			throw new RuntimeException();
		}
	}
	//3.公有get方法
	public static synchronized Singleton2 getInstance(){//可能会同时被多个线程访问，因此加同步快，造成调用效率低
	//要防止线程同步
		if(null==instance){
			instance = new Singleton2();//延时加载
		}
		return instance;
	}
}
