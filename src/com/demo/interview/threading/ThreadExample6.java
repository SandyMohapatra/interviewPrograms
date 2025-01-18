package com.demo.interview.threading;

public class ThreadExample6 {

	public static void main(String[] args) {
		Runnable myRun1 = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " running");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName + " ended");
		};
	
		Thread t1 = new Thread(myRun1);
		t1.start();
		
		Thread t2 = new Thread(myRun1);
		t2.start();
	}

}
