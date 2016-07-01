package com.shc.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author shc
 * 通过序列化与反序列化破解以上单例设计模式（枚举除外）
 */
public class Singletons_Test_03 {

	public static void main(String[] args) throws Exception {
		
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
	}
}
