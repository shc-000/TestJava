package com.shc.singleton;
//����ʽ
public class Singleton01 {
	//1.˽�еľ�̬�ı���
	private static Singleton01 instance=new Singleton01();
	//2.˽�еĹ�����
	private Singleton01(){}
	//3.���е�get()����
	public static Singleton01 getInstance(){
		return instance;
	}
}
