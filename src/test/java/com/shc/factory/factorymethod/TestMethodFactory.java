package com.shc.factory.factorymethod;

public class TestMethodFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new AudiFactory().createCar();
		c1.run();
		Car c2=new BydFactorry().createCar();
		c2.run();
		//如果现在增加一个奔驰类
		/*
		 * 只需要新建一个BenChi的类实现Car接口
		 * 在新建一个奔驰的工厂实现CarFactory接口就可以了
		 */
		Car c3=new BenChiFactory().createCar();
		c3.run();
	}

}
