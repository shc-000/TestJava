package com.shc.singleton;
/**
 * @author shc
 * 测试单例模式
 */
public class SingletonsTest_01 {
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
}
