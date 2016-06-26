package com.shc.singleton;
/*
 * 测试单例模式
 * */
public class Singletons {
	/*
	 * 之饿汉式<clinit>()方法保证静态初始化为正确加锁和同步
	 * private static Singletons instance=new Singletons();
	private Singletons(){};
	public static Singletons getInstance(){
		return instance;
	}*/
	/*之懒汉式、、存在线程等待，效率低
	 * private static Singletons instance;
	private Singletons(){};
	public static Singletons getInstance(){
		return new Singletons();
	};*/
	//懒汉式之防止反射和反序列化漏洞
	/*private static Singletons instance;
	private Singletons(){
		if(null!=instance){
			throw new RuntimeException();
		}
	}
	public static Singletons getInstance(){
		if(null!=instance){
			return instance;
		}else{
			return new Singletons();
		}
	}*/
	//单例之静态内部类
	private static class SingletonClass{
		private static final Singletons instance=new Singletons();
	}
	public static Singletons getInstance(){
		return SingletonClass.instance;
	} 
	public Singletons(){}
}
