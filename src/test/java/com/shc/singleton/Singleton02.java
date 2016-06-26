package com.shc.singleton;
//懒汉式
public class  Singleton02 {
	//1.私有的静态的变量
	private static Singleton02 instance;
	//2.私有的构造器
	private Singleton02(){
		if(instance!=null){
			throw new RuntimeException();//防止反射和反序列化漏洞
		}
	}
	//3.公有get方法
	public static synchronized Singleton02 getInstance(){
	//要防止线程同步
		if(null==instance){
			return new Singleton02();//延时加载
		}
		return instance;
	}
}
