package com.shc.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test_01 {

	public static Date d = new Date();
	public static final Date d1 = new Date();
	public static void main(String[] args) {
		System.out.println(d.hashCode()+"全局1");
		System.out.println(d1.hashCode()+"全局2");

		List list = new ArrayList<>();
		Date date = new Date();
		System.out.println(System.currentTimeMillis());
		list.add(d);
		System.out.println(date.hashCode()+"局部1");
		System.out.println(list.size());
		//date.setDate(1);
		
		/*try {
			new Thread().sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Date date1 = new Date();
		System.out.println(System.currentTimeMillis());
		System.out.println(date1.hashCode()+"局部2");
		list.remove(d1);
		
		System.out.println(d.equals(d1));
		System.out.println(list.size());
		
	}

}
