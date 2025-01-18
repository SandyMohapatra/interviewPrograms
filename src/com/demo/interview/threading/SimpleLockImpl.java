package com.demo.interview.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
	private long count = 0;
	Lock lock = new ReentrantLock();
	
	public long inc() {
		try {
			lock.lock();
			return this.count++;
		} finally {
			lock.unlock();
		}
	}
	
	public long getCount() {
		try {
			lock.lock();
			return this.count;
		} finally {
			lock.unlock();
		}
	}
}

public class SimpleLockImpl {

}
