package com.demo.interview.threading;

public class ThreadExample9 {

	public static void main(String[] args) {
		// Java thread will run even if main has stopped unless marked Daemon
		
		Runnable myRun = () -> {
			while(true) {
				sleep(1000);
				System.out.println("Running");
			}
		};
		
		Thread t1 = new Thread(myRun);
		t1.setDaemon(true);
		t1.start();
		sleep(3100);
	}
	
	public static void sleep(long millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
