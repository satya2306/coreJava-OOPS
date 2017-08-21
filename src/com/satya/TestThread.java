package com.satya;

public class TestThread {
	public static Object Lock1 = new Object();
	   public static Object Lock2 = new Object();
	   
	   public static void main(String args[]) {
		   TestThread t=new TestThread();
	      ThreadDemo1 T1 = t.new ThreadDemo1();
	      ThreadDemo2 T2 =t. new ThreadDemo2();
	      T1.start();
	      T2.start();
	   }
	   
	   public class ThreadDemo1  extends Thread {

			@Override
			public void run() {
				synchronized (Lock1) {
		            System.out.println("Thread 1: Holding lock 1...");
		            
		            try { Thread.sleep(10); }
		            catch (InterruptedException e) {}
		            
		            System.out.println("Thread 1: Waiting for lock 2...");
		            
		            synchronized (Lock2) {
		               System.out.println("Thread 1: Holding lock 1 & 2...");
		            }
		         }
			}
	   
	   }
	   
	   public class ThreadDemo2  extends Thread {

			@Override
			public void run() {
				synchronized (Lock1) {
		            System.out.println("Thread 2: Holding lock 1...");
		            
		            try { Thread.sleep(10); }
		            catch (InterruptedException e) {}
		            System.out.println("Thread 2: Waiting for lock 2...");
		            
		            synchronized (Lock2) {
		               System.out.println("Thread 2: Holding lock 1 & 2...");
		            }
		         }
			}
	   
	   }   
	   
}
