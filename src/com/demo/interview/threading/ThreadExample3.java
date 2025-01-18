package com.demo.interview.threading;

public class ThreadExample3 {

	public static class MyRunnable implements Runnable {

		@Override
		public void run() {
			System.out.println("My Runnable running");
			System.out.println("My Runnable ended");
		}
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
	}

}
