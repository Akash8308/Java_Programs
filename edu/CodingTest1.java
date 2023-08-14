package com.edu;


class utility{
	void triangle(int num) {
		//int num1=3,num2=2,num3=4;
		
		for(int i=1; i<=num; i++) {
			for(int k=num-i;k>0;k--) { //2 
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
			
			}
		}
	
	
	void revtriangle(int num) {
	//int num1=3,num2=2,num3=4;
	
	for(int i=num; i>0; i--) {
		for(int k=num-i;k>0;k--) { //2 
			System.out.print(" ");
		}
		for(int j=0;j<i;j++) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		
		}
	}
}


public class CodingTest1 {

	public static void main(String[] args) {
		int num1=3,num2=2,num3=4;
		utility u = new utility();
		u.triangle(num1);
		u.triangle(num2);
		u.triangle(num3);
		System.out.println();
		u.revtriangle(num1);
		u.revtriangle(num2);
		u.revtriangle(num3);
	}

}
