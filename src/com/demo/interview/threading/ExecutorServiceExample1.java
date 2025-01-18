package com.demo.interview.threading;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Task");
			}
		});
		
		Future future = executorService.submit(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task");
		    }
		});
		System.out.println(future.get());
		
		
		Future future1 = executorService.submit(new Callable<String>(){
		    public String call() throws Exception {
		        System.out.println("Asynchronous Callable");
		        return "Callable Result";
		    }
		});
		System.out.println("future.get() = " + future1.get());
		
		
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 1";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 2";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 3";
		    }
		});
		String result = executorService1.invokeAny(callables);
		System.out.println("result = " + result);
		
		
		Set<Callable<String>> callables1 = new HashSet<Callable<String>>();
		int idx=1;
		
		while (idx < 4) {
			final int i = idx;
			callables1.add(new Callable<String>() {
			    public String call() throws Exception {
			        return "Task "+i;
			    }
			});
			idx++;
		}

		List<Future<String>> futures = executorService1.invokeAll(callables1);

		for(Future<String> future2 : futures){
		    System.out.println("future.get = " + future2.get());
		}

		executorService1.shutdown();
		executorService.shutdown();
	}

}
