package com.shc.factory.factorymethod;

public class TestMethodFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new AudiFactory().createCar();
		c1.run();
		Car c2=new BydFactorry().createCar();
		c2.run();
		//�����������һ��������
		/*
		 * ֻ��Ҫ�½�һ��BenChi����ʵ��Car�ӿ�
		 * ���½�һ�����۵Ĺ���ʵ��CarFactory�ӿھͿ�����
		 */
		Car c3=new BenChiFactory().createCar();
		c3.run();
	}

}
