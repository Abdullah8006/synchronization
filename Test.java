package com.test;

public class Test {
	
	private String test;

	public String getTest() {
		System.out.println(Thread.currentThread().getName() );
		return test;
	}

	public synchronized void setTest(String test) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "start");
		Thread.sleep(30000);
		this.test = test;
		System.out.println(Thread.currentThread().getName() + "end");
	}

}
