package com.edu;

class Hello extends Thread{
	public void run() {
		for(int i =0;i<6;i++) {
			System.out.println("Childe thread " + Thread.currentThread());
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("Main " + Thread.currentThread());
		Hello ob = new Hello();
		Hello ob1 = new Hello();
		ob.setName("FirstThread");
		ob1.setName("SecondThread");
		
		ob.run();
//		ob.start();
//		ob.start();
		ob1.start();

	}

}
