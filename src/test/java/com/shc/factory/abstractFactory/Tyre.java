package com.shc.factory.abstractFactory;

public interface Tyre/*��̥*/ {
	void revolve();
}
class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("��ת��ĥ��");
	}
	
}
class LowTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("��תĥ���");
	}
	
}
