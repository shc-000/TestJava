package com.shc.singleton;

import java.lang.reflect.Constructor;

/**
 * @author shc
 * 通过反射破解以上单例设计模式（枚举除外）
 */
public class Singletons_Test_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Singleton01 s1 = Singleton01.getInstance();
		Singleton01 s2 = Singleton01.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		//通过反射直接调用私有构造器
		//反射破解饿汉式单例
		System.out.println("---------饿汉式反射漏洞----------");
		Class<Singleton01> clazz = (Class<Singleton01>) Class.forName("com.shc.singleton.Singleton01");
		Constructor<Singleton01> c = clazz.getDeclaredConstructor(null);//获得无参构造器
		c.setAccessible(true);//跳过权限检查，访问私有的构造器
		Singleton01 s3 = c.newInstance();
		Singleton01 s4 = c.newInstance();
		System.out.println(s3);
		System.out.println(s4);
		//避免反射破解饿汉式漏洞
		/*System.out.println("---------破解饿汉式反射漏洞----------");
		Class<Singleton1> clazz1 = (Class<Singleton1>) Class.forName("com.shc.singleton.Singleton1");
		Constructor<Singleton1> c1 = clazz1.getDeclaredConstructor(null);//获得无参构造器
		c1.setAccessible(true);//跳过权限检查，访问私有的构造器
		Singleton1 s5 = c1.newInstance();
		Singleton1 s6 = c1.newInstance();
		System.out.println(s5);
		System.out.println(s6);*/
		
		System.out.println("---------懒汉式反射漏洞----------");
		Class<Singleton02> clazz2 = (Class<Singleton02>) Class.forName("com.shc.singleton.Singleton02");
		Constructor<Singleton02> c2 = clazz2.getDeclaredConstructor(null);//获得无参构造器
		c2.setAccessible(true);//跳过权限检查，访问私有的构造器
		Singleton02 s7 = c2.newInstance();
		Singleton02 s8 = c2.newInstance();
		System.out.println(s7);
		System.out.println(s8);
		
		
		//反射破解懒汉式(有问题了)懒汉式在无参构造器中判断instance都是null此时还没有初始化。
		System.out.println("---------破解懒汉式反射漏洞----------");
		Class<Singleton2> clazz3 = (Class<Singleton2>) Class.forName("com.shc.singleton.Singleton2");
		Constructor<Singleton2> c3 = clazz3.getDeclaredConstructor(null);//获得无参构造器
		c3.setAccessible(true);//跳过权限检查，访问私有的构造器
		Singleton2 s9 = c3.newInstance();
		Singleton2 s10 = c3.newInstance();
		System.out.println(s9);
		System.out.println(s10);
		
		System.out.println("---------静态内部类反射漏洞----------");
		Class<Singleton03> clazz4 = (Class<Singleton03>) Class.forName("com.shc.singleton.Singleton03");
		Constructor<Singleton03> c4 = clazz4.getDeclaredConstructor(null);//获得无参构造器
		c4.setAccessible(true);//跳过权限检查，访问私有的构造器
		Singleton03 s11 = c4.newInstance();
		Singleton03 s12 = c4.newInstance();
		System.out.println(s11);
		System.out.println(s12);
		
		System.out.println("---------破解静态内部类反射漏洞----------");
		Class<Singleton3> clazz5 = (Class<Singleton3>) Class.forName("com.shc.singleton.Singleton3");
		Constructor<Singleton3> c5 = clazz5.getDeclaredConstructor(null);//获得无参构造器
		c5.setAccessible(true);//跳过权限检查，访问私有的构造器
		Singleton3 s13 = c5.newInstance();
		Singleton3 s14 = c5.newInstance();
		System.out.println(s13);
		System.out.println(s14);
	}

}
