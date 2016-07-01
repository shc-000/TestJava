package com.shc.singleton;

import java.lang.reflect.Constructor;

/**
 * 
 * @author shc
 * 通过反射破解以上单例设计模式（枚举除外）
 */
public class SingletonsTest_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Singleton01 s1 = Singleton01.getInstance();
		Singleton01 s2 = Singleton01.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		//通过反射直接调用私有构造器
		//反射破解饿汉式
		Class<Singleton01> clazz = (Class<Singleton01>) Class.forName("com.shc.singleton.Singleton01");
		Constructor<Singleton01> c = clazz.getDeclaredConstructor(null);//获得无参构造器
		c.setAccessible(true);//跳过权限检查，访问私有的构造器
		Singleton01 s3 = c.newInstance();
		Singleton01 s4 = c.newInstance();
		System.out.println(s3);
		System.out.println(s4);
		
		//反射破解懒汉式(有问题了)懒汉式在无参构造器中判断instance都是null此时还没有初始化。
		/*Class<Singleton2> clazz = (Class<Singleton2>) Class.forName("com.shc.singleton.Singleton2");
		Constructor<Singleton2> c = clazz.getDeclaredConstructor(null);//获得无参构造器
		c.setAccessible(true);//跳过权限检查，访问私有的构造器
		Singleton2 s3 = c.newInstance();
		Singleton2 s4 = c.newInstance();
		System.out.println(s3);
		System.out.println(s4);*/
		
		//如何防止反射破解单例（在私有构造器中抛出异常的方式），如Singleton1，Singleton2
		/*Class<Singleton1> clazz = (Class<Singleton1>) Class.forName("com.shc.singleton.Singleton1");
		Constructor<Singleton1> c = clazz.getDeclaredConstructor(null);//获得无参构造器
		c.setAccessible(true);//跳过权限检查，访问私有的构造器
		Singleton1 s3 = c.newInstance();
		Singleton1 s4 = c.newInstance();
		System.out.println(s3);
		System.out.println(s4);*/
		
	}

}
