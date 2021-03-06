package com.java8;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Runner {
	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		
		System.out.println("waiting...");
		condition.await();
		System.out.println("waken up...");
		
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void secondThread() throws InterruptedException {
		Thread.sleep(1000);
		lock.lock();
		
		System.out.println("Press the return key...");
		new Scanner(System.in).nextLine();
		System.out.println("Got return key.");
		
		condition.signal();
		
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void finished() {
		System.out.println("Count = " + count);
	}
}

public class ThreadLockDemo {
	public static void main(String[] args) {
		Runner runner = new Runner();

		Thread t1 = new Thread(() -> {
			try {
				runner.firstThread();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				runner.secondThread();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		runner.finished();

	}

}
