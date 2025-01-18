package com.demo.interview.threading;

public class ThreadExample2 {
	
	public static class MyThread extends Thread {
		
		public void run() {
			System.out.println("MyThread running");
			System.out.println("MyThread finished");
		}
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
	}

}
