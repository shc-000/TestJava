package com.shc.factory.factorymethod;

public class BydFactorry implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Byd();
	}

}
