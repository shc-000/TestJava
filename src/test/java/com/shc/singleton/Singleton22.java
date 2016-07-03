package com.shc.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
//懒汉式破解反序列化漏洞
public class Singleton22 implements Serializable {

	//1.私有的静态的变量
		private static Singleton22 instance;
		//2.私有的构造器
		private Singleton22(){
		}
		//3.公有get方法
		public static synchronized Singleton22 getInstance(){//可能会同时被多个线程访问，因此加同步快，造成调用效率低
		//要防止线程同步
			if(null==instance){
				instance = new Singleton22();//延时加载
			}
			return instance;
		}
		//反序列化时(加这个方法可以防止反序列化漏洞)
		private Object readResolve() throws ObjectStreamException{
			return instance;
		}
}
