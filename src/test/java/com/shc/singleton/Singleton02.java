package com.shc.singleton;
//����ʽ
public class  Singleton02 {
	//1.˽�еľ�̬�ı���
	private static Singleton02 instance;
	//2.˽�еĹ�����
	private Singleton02(){
		if(instance!=null){
			throw new RuntimeException();//��ֹ����ͷ����л�©��
		}
	}
	//3.����get����
	public static synchronized Singleton02 getInstance(){
	//Ҫ��ֹ�߳�ͬ��
		if(null==instance){
			return new Singleton02();//��ʱ����
		}
		return instance;
	}
}
