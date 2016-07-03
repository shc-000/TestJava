package com.shc.singleton;
//破解静态内部类反射漏洞
public class Singleton3 {
	
	//外部类没有static属性，则不会像饿汉式那样立即加载对象
		private static class SingletonClassInstance{
			private static final Singleton3 instance=new Singleton3();
		}
		//只有真正调用getInstance(),才会加载静态内部类。加载类时是线程安全的。instance是static final类型
		//保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全性
		public static Singleton3 getInstance(){
			return SingletonClassInstance.instance;
		}
		private Singleton3(){
			if (null != Singleton3.getInstance()) {
				throw new RuntimeException();
			}
		}
}
