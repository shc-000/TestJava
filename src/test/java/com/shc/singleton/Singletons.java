package com.shc.singleton;
/*
 * ���Ե���ģʽ
 * */
public class Singletons {
	/*
	 * ֮����ʽ<clinit>()������֤��̬��ʼ��Ϊ��ȷ������ͬ��
	 * private static Singletons instance=new Singletons();
	private Singletons(){};
	public static Singletons getInstance(){
		return instance;
	}*/
	/*֮����ʽ���������̵߳ȴ���Ч�ʵ�
	 * private static Singletons instance;
	private Singletons(){};
	public static Singletons getInstance(){
		return new Singletons();
	};*/
	//����ʽ֮��ֹ����ͷ����л�©��
	/*private static Singletons instance;
	private Singletons(){
		if(null!=instance){
			throw new RuntimeException();
		}
	}
	public static Singletons getInstance(){
		if(null!=instance){
			return instance;
		}else{
			return new Singletons();
		}
	}*/
	//����֮��̬�ڲ���
	private static class SingletonClass{
		private static final Singletons instance=new Singletons();
	}
	public static Singletons getInstance(){
		return SingletonClass.instance;
	} 
	public Singletons(){}
}
