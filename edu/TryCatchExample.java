package com.edu;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
//			System.exit(0);	
			System.out.println(12/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
//			System.exit(0);
			return;
		}
		finally {
			System.out.println("Done");
		}
	}

}
