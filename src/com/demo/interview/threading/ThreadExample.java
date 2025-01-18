package com.demo.interview.threading;

public class ThreadExample {
	public static void main(String args[]) {
		Thread t1 = new Thread();
		t1.start();
		System.out.println("Hello");
	}
}
