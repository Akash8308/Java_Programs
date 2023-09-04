package com.edu;

public class AnnonymousClassMain {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Run Method_1");
			}
		};
		t1.start();
		
		new Thread() {
			public void run() {
				System.out.println("Run Method_2");
			}
		}.start();

	}

}
