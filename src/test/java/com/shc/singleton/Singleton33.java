package com.shc.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;


	public class Singleton33 implements Serializable{
		//外部类没有static属性，则不会像饿汉式那样立即加载对象
		private static class SingletonClassInstance{
			private static final Singleton33 instance=new Singleton33();
		}
		//只有真正调用getInstance(),才会加载静态内部类。加载类时是线程安全的。instance是static final类型
		//保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全性
		public static Singleton33 getInstance(){
			return SingletonClassInstance.instance;
		}
		private Singleton33(){}
		
		//反序列化时(加这个方法可以防止反序列化漏洞)
		private Object readResolve() throws ObjectStreamException{
			return Singleton33.getInstance();
		}
}
