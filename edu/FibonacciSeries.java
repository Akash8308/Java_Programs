//1 1 2 3 5 8 13 21 34.... nterms
package com.edu;

import java.util.Scanner;

class RandomSeires{
	int sum = 0;
	void method1() {
		int terms;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of terms");
		terms = sc.nextInt();
		System.out.println(0 +"+1"+ " / ");
		for(int i=0;i<=terms;i++) {  
			System.out.println((i+1) +"+1"+ " / ");
			sum += (i+1);
		}
		System.out.println("Sum is: " + sum);
	}
	
	void method2() {
		int terms;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of terms");
		terms = sc.nextInt();
		System.out.println(0 +"-1"+ " / ");
		for(int i=0;i<=terms;i++) { 
			if(i%2 == 0) {
				System.out.println((i+1) +"-1"+ " / ");
				sum += (i+1);
			}
			else {
				System.out.println((i+1) +"+1"+ " / ");
				sum += (i-1);
			}
		
		}
		System.out.println("Sum is: " + sum);
	}
	
		void findFactorial() {
			int fact = 1;
			System.out.println("Enter number of terms: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			for(int k =1; k<=num;k++) {
				for(int i=k;i>=1;i--) {
					fact = fact*i;
				}
				System.out.println("fact of " + k + " = " + fact);
			
			}
	
	}
}

public class FibonacciSeries {
public static void main(String[] args) {
	
	RandomSeires r= new RandomSeires();
		r.findFactorial();
	
}
}