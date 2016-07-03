package com.shc.singleton;

import java.io.Serializable;

//懒汉式
public class  Singleton02 implements Serializable{
	//1.私有的静态的变量
	private static Singleton02 instance;
	//2.私有的构造器
	private Singleton02(){
	}
	//3.公有get方法
	public static synchronized Singleton02 getInstance(){//可能会同时被多个线程访问，因此加同步快，造成调用效率低
	//要防止线程同步
		if(null==instance){
			instance = new Singleton02();//延时加载
		}
		return instance;
	}
}
