package com.shc.factory.abstractFactory;

public interface Seat/*座椅*/ {
	void massage();//按摩
}
class LuxurySeat implements Seat{

	@Override
	public void massage() {
		// TODO Auto-generated method stub
		System.out.println("可以自动按摩");
	}
	
}
class LowSeat implements Seat{

	@Override
	public void massage() {
		// TODO Auto-generated method stub
		System.out.println("不能按摩");
	}
	
}