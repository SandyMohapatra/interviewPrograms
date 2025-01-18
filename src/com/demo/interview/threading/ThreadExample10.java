package com.demo.interview.threading;

import java.util.Iterator;

public class ThreadExample10 {

	public static void main(String[] args) {
		Runnable myRun1 = () -> {
			for (int i = 0; i < 5; i++) {
				sleep(1000);
				System.out.println("Running");
			}
		};
		
		Thread t1 = new Thread(myRun1);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
