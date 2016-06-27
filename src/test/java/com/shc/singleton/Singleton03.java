package com.shc.singleton;
//静态内部类，兼备了高效调用和延迟加载的优势
public class Singleton03 {
	//外部类没有static属性，则不会像饿汉式那样立即加载对象
	private static class SingletonClassInstance{
		private static final Singleton03 instance=new Singleton03();
	}
	//只有真正调用getInstance(),才会加载静态内部类。加载类时是线程安全的。instance是static final类型
	//保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全性
	public static Singleton03 getInstance(){
		return SingletonClassInstance.instance;
	}
	private Singleton03(){}
}
