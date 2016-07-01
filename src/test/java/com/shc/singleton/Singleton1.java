package com.shc.singleton;

/**
 * @author shc
 * 破解饿汉式反射漏洞
 */
public class Singleton1 {

	//1.私有的静态的变量
	private static Singleton1 instance=new Singleton1();
	//2.私有的构造器
	private Singleton1(){
		if (null != instance) {
			throw new RuntimeException();
		}
	}
	//3.共有的get()方法
	public static /*synchronized*/  Singleton1 getInstance(){//天然的线程安全，不需要加同步块，因此调用效率高
		return instance;
	}

}
