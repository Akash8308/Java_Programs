package com.edu;

class MultiTable{
	synchronized void table (int n) {
		for(int i =1; i<=10;i++) {
			System.out.println(n+ "x"+i+ "="+n*i);
		}
	}
}

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread "+Thread.currentThread());
			
		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}
	}

class MyThread2 extends Thread{
	MultiTable t2;
	public MyThread2(MultiTable table) {
		this.t2=table;
	}
	public void run() {
		t2.table(2);
	}
}

class MyThread3 extends Thread{
	MultiTable t3;
	public MyThread3(MultiTable table) {
		this.t3=table;
	}
	public void run() {
		t3.table(3);
	}
}

public class ThreadingEx {

	public static void main(String[] args) throws InterruptedException {
//		MyThread tob1=new MyThread();
//		MyThread tob2=new MyThread();
//		tob2.setName("second");
//		tob1.setName("first");
//		
//		
//		System.out.println("first isalive "+tob1.isAlive());
//		System.out.println("second isalive "+tob2.isAlive());
//		tob2.start();
//		System.out.println("second isalive "+tob2.isAlive());
//		tob2.join();
//		System.out.println("second isalive "+tob2.isAlive());
//		System.out.println("first isalive "+tob1.isAlive());
//		tob1.start();
//		System.out.println("first isalive "+tob1.isAlive());
		
		MultiTable table = new MultiTable();
//		MyThread t1 = new MyThread();
//		t1.start();
		MyThread2 t2 = new MyThread2(table);
		t2.start();
		MyThread3 t3 = new MyThread3(table);
		t3.start();

	}

}