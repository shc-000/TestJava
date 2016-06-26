package com.shc.factory.abstractFactory;

public interface Tyre/*ÂÖÌ¥*/ {
	void revolve();
}
class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Ðý×ª²»Ä¥Ëð");
	}
	
}
class LowTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Ðý×ªÄ¥Ëð¿ì");
	}
	
}
