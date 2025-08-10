package com.wipro.Test;

import com.wipro.Thread.Counter;
import com.wipro.Thread.MyThread;

public class CounterTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
	}

}
