package com.demo.interview.threading;

public class ThreadExample4 {
	
	public static void main(String[] args) {
		Runnable myRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Runnable running");
				System.out.println("My Runnable ended");
			}
			
		};
		
		Thread t1 = new Thread(myRunnable);
		t1.start();
		
		Runnable myRunnable1 = () -> {
				System.out.println("My Runnable running");
				System.out.println("My Runnable ended");
		};
		
		Thread t2 = new Thread(myRunnable1);
		t2.start();
	}
}
