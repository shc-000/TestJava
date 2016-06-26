package com.shc.factory.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=CarFactory.createCar("奥迪");
		Car c2=CarFactory.createCar("比亚迪");
		//这时如果增加一个奔驰，就需要修改Carfactory的代码了
		//这违反了开闭原则
	}

}
