package com.shc.factory.abstractFactory;

public interface Seat/*����*/ {
	void massage();//��Ħ
}
class LuxurySeat implements Seat{

	@Override
	public void massage() {
		// TODO Auto-generated method stub
		System.out.println("�����Զ���Ħ");
	}
	
}
class LowSeat implements Seat{

	@Override
	public void massage() {
		// TODO Auto-generated method stub
		System.out.println("���ܰ�Ħ");
	}
	
}