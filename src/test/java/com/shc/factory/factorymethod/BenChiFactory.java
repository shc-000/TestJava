package com.shc.factory.factorymethod;

public class BenChiFactory implements CarFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new BenChi();
	}

}
