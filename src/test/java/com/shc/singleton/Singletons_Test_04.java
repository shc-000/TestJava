package com.shc.singleton;

import java.util.concurrent.CountDownLatch;
//测试几种单例模式的效率
public class Singletons_Test_04 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		int threadNum =10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for (int j = 0; j < 100000; j++) {
						Object object = Singleton01.getInstance();
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();
		long end = System.currentTimeMillis();
		System.out.println("总耗时："+(end-start));
	}
	
	

}
