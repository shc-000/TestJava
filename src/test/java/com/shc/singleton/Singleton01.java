package com.shc.singleton;

import java.io.Serializable;

//����ʽ
public class Singleton01 implements Serializable{
	//1.˽�еľ�̬�ı���
	private static Singleton01 instance=new Singleton01();
	//2.˽�еĹ�����
	private Singleton01(){}
	//3.���е�get()����
	public static /*synchronized*/  Singleton01 getInstance(){//��Ȼ���̰߳�ȫ������Ҫ��ͬ���飬��˵���Ч�ʸ�
		return instance;
	}
}
