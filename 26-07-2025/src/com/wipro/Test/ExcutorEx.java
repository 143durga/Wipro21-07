package com.wipro.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(5);
		 for (int i = 1; i <= 5; i++) {
	            int taskId = i;
	            executor.submit(() -> {
	                for (int j = 1; j <= 10; j++) {
	                    System.out.println("Task " + taskId + " - Number: " + j);
	                    try {
	                        Thread.sleep(1000); 
	                    } catch (InterruptedException e) {
	                        Thread.currentThread().interrupt();
	                    }
	                }
	            });
	        }

	        executor.shutdown();

	}

}
