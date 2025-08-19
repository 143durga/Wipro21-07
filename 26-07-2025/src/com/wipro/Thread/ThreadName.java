package com.wipro.Thread;

import com.wipro.Test.ThreadTask;

public class ThreadName {
    public static void main(String[] args) throws InterruptedException {
        ThreadTask task = new ThreadTask();

        Thread t1 = new Thread(task.capitalizeVowels);
        Thread t2 = new Thread(task.lowercaseConsonants);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final List: " + task.getNames());
    }
}
