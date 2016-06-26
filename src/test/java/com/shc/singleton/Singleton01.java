package com.shc.singleton;
//饿汉式
public class Singleton01 {
	//1.私有的静态的变量
	private static Singleton01 instance=new Singleton01();
	//2.私有的构造器
	private Singleton01(){}
	//3.共有的get()方法
	public static Singleton01 getInstance(){
		return instance;
	}
}
