package com.wipro.Thread;

public class ThreadEx extends Thread {
    int threadNum;

    public ThreadEx(int threadNum) {
        this.threadNum = threadNum;
    }

    public void run() {
        if (threadNum == 1) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1 - Number: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else if (threadNum == 2) {
            for (char ch = 'A'; ch <= 'J'; ch++) {
                System.out.println("Thread 2 - Alphabet: " + ch);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadEx t1 = new ThreadEx(1);
        ThreadEx t2 = new ThreadEx(2);

        t1.start();
        t2.start();
    }
}
