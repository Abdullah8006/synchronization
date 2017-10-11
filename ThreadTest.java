package com.test;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		final Test test = new Test();

		Runnable farhan = new Runnable() {
			public void run() {
				try {
					test.setTest("FARHAN");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread threadFarhan = new Thread(farhan);
		threadFarhan.setName("FARHAN THREAD");
		threadFarhan.start();

		Thread.sleep(10000);

		Runnable abdullah = new Runnable() {
			public void run() {
				test.getTest();
			}
		};
		Thread threadAbdullah = new Thread(abdullah);
		threadAbdullah.setName("ABDULLAH THREAD");
		threadAbdullah.start();

	}

}
