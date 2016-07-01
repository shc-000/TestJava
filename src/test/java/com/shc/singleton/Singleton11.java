package com.shc.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

//饿汉式破解反序列化的漏洞
public class Singleton11 implements Serializable{
	//1.私有的静态的变量
	private static Singleton11 instance=new Singleton11();
	//2.私有的构造器
	private Singleton11(){}
	//3.共有的get()方法
	public static /*synchronized*/  Singleton11 getInstance(){
		return instance;
	}
	//反序列化时(加这个方法可以防止反序列化漏洞)
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
