package com.shc.singleton;

import java.io.Serializable;

//饿汉式
public class Singleton01 implements Serializable{
	//1.私有的静态的变量
	private static Singleton01 instance=new Singleton01();
	//2.私有的构造器
	private Singleton01(){}
	//3.共有的get()方法
	public static /*synchronized*/  Singleton01 getInstance(){//天然的线程安全，不需要加同步块，因此调用效率高
		return instance;
	}
}
