package com.shc.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author shc
 * 通过序列化与反序列化破解以上单例设计模式（枚举除外）
 */
public class Singletons_Test_03 {

	public static void main(String[] args) throws Exception {
		//饿汉式反序列化漏洞
		System.out.println("-----------------饿汉式反序列化漏洞------------------");
		Singleton01 s1 = Singleton01.getInstance();
		Singleton01 s2 = Singleton01.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		//序列化
		FileOutputStream fos = new FileOutputStream("../a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		//反序列化
 		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("../a.txt"));
 		Singleton01 s3 = (Singleton01) ois.readObject();
 		System.out.println(s3);
 		
 		
 		
 		//破解饿汉式反序列化漏洞
 		System.out.println("-----------------破解饿汉式反序列化漏洞------------------");
 		Singleton11 s4 = Singleton11.getInstance();
		Singleton11 s5 = Singleton11.getInstance();
		System.out.println(s4);
		System.out.println(s5);
		
		//序列化
		FileOutputStream fos1 = new FileOutputStream("../b.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(s4);
		oos1.close();
		fos1.close();
		//反序列化
 		ObjectInputStream ois1 =new ObjectInputStream(new FileInputStream("../b.txt"));
 		Singleton11 s6 = (Singleton11) ois1.readObject();
 		System.out.println(s6);
 		
 		//懒汉式反序列化漏洞
 		 System.out.println("-----------------懒汉式反序列化漏洞------------------");
		 		Singleton02 s7 = Singleton02.getInstance();
				Singleton02 s8 = Singleton02.getInstance();
				System.out.println(s7);
				System.out.println(s8);
		 		//序列化
 				FileOutputStream fos2 = new FileOutputStream("../c.txt");
 				ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
 				oos2.writeObject(s7);
 				oos2.close();
 				fos2.close();
 				//反序列化
 		 		ObjectInputStream ois2 =new ObjectInputStream(new FileInputStream("../c.txt"));
 		 		Singleton02 s9 = (Singleton02) ois2.readObject();
 		 		System.out.println(s9);
 	  
 		//破解懒汉式反序列化漏洞
 		 System.out.println("-----------------破解懒汉式反序列化漏洞------------------");
 		 		Singleton22 s10 = Singleton22.getInstance();
				Singleton22 s11 = Singleton22.getInstance();
				System.out.println(s10);
				System.out.println(s11);
		 		//序列化
 				FileOutputStream fos3 = new FileOutputStream("../d.txt");
 				ObjectOutputStream oos3 = new ObjectOutputStream(fos3);
 				oos3.writeObject(s10);
 				oos3.close();
 				fos3.close();
 				//反序列化
 		 		ObjectInputStream ois3 =new ObjectInputStream(new FileInputStream("../d.txt"));
 		 		Singleton22 s12 = (Singleton22) ois3.readObject();
 		 		System.out.println(s12);
 		 		
 		 //静态内部类反序列化漏洞
 		 System.out.println("-----------------静态内部类反序列化漏洞------------------");
 		 Singleton03 s13 = Singleton03.getInstance();
 		 Singleton03 s14 = Singleton03.getInstance();
 		 System.out.println(s13);
 		 System.out.println(s14);
 		//序列化
			FileOutputStream fos4 = new FileOutputStream("../e.txt");
			ObjectOutputStream oos4 = new ObjectOutputStream(fos4);
			oos4.writeObject(s13);
			oos4.close();
			fos4.close();
			//反序列化
	 		ObjectInputStream ois4 =new ObjectInputStream(new FileInputStream("../e.txt"));
	 		Singleton03 s15 = (Singleton03) ois4.readObject();
	 		System.out.println(s15);
	 //破解静态内部类反序列化漏洞
	 System.out.println("-----------------破解静态内部类反序列化漏洞------------------");
	 Singleton33 s16 = Singleton33.getInstance();
		 Singleton33 s17 = Singleton33.getInstance();
		 System.out.println(s16);
		 System.out.println(s17);
		//序列化
		FileOutputStream fos5 = new FileOutputStream("../f.txt");
		ObjectOutputStream oos5 = new ObjectOutputStream(fos5);
		oos5.writeObject(s16);
		oos5.close();
		fos5.close();
		//反序列化
 		ObjectInputStream ois5 =new ObjectInputStream(new FileInputStream("../f.txt"));
 		Singleton33 s18 = (Singleton33) ois5.readObject();
 		System.out.println(s18);
	}
}
