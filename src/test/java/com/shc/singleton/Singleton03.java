package com.shc.singleton;
//��̬�ڲ��࣬�汸�˸�Ч���ú��ӳټ��ص�����
public class Singleton03 {
	//�ⲿ��û��static���ԣ��򲻻������ʽ�����������ض���
	private static class SingletonClassInstance{
		private static final Singleton03 instance=new Singleton03();
	}
	//ֻ����������getInstance(),�Ż���ؾ�̬�ڲ��ࡣ������ʱ���̰߳�ȫ�ġ�instance��static final����
	//��֤���ڴ���ֻ������һ��ʵ�����ڣ�����ֻ�ܱ���ֵһ�Σ��Ӷ���֤���̰߳�ȫ��
	public static Singleton03 getInstance(){
		return SingletonClassInstance.instance;
	}
	private Singleton03(){}
}
