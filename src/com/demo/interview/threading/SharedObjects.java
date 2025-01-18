package com.demo.interview.threading;

import java.util.Arrays;

class MyRunnable implements Runnable {

	private int count = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			synchronized (this) {
				this.count++;
			}
		}
		System.out.println(Thread.currentThread().getName() + " : "+this.count);
	}
	
}

public class SharedObjects {

	public static void main(String[] args) {
		MyRunnable myRun = new MyRunnable();
		Thread t1 = new Thread(myRun);
		t1.start();
		
		Thread t2 = new Thread(myRun);
		t2.start();
	
		String str = "are";
		char[] ch = str.toCharArray(); 
		Arrays.sort(ch);
		System.out.println(str +" : "+new String(ch));
		Arrays.asList(ch).forEach(c -> System.out.println(c));
	}

}
