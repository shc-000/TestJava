package com.shc.singleton;

import java.io.Serializable;

//����ʽ
public class  Singleton02 implements Serializable{
	//1.˽�еľ�̬�ı���
	private static Singleton02 instance;
	//2.˽�еĹ�����
	private Singleton02(){
	}
	//3.����get����
	public static synchronized Singleton02 getInstance(){//���ܻ�ͬʱ������̷߳��ʣ���˼�ͬ���죬��ɵ���Ч�ʵ�
	//Ҫ��ֹ�߳�ͬ��
		if(null==instance){
			instance = new Singleton02();//��ʱ����
		}
		return instance;
	}
}
