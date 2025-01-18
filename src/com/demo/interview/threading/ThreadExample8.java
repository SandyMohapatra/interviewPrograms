package com.demo.interview.threading;

public class ThreadExample8 {
	
	public static class StoppableRunnable implements Runnable {

		private boolean stopRequested = false;
		
		public synchronized void requestStop() {
			this.stopRequested = true;
		}
		
		public synchronized boolean isStopRequested() {
			return this.stopRequested;
		}
		
		private void sleep(long milliSec) {
			try {
				Thread.sleep(milliSec);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " running");
			while (!stopRequested) {
				sleep(2000);
				System.out.println("....");
			}
			System.out.println(threadName + " stopped");
		}
		
	}

	public static void main(String[] args) {
		StoppableRunnable sr = new StoppableRunnable();
		Thread t1 = new Thread(sr, "My Thread");
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("requesting stop");
		sr.requestStop();
		System.out.println("thread stopped");
	}

}
