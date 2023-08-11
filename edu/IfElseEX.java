package com.edu;

import java.util.Scanner;

//check divisibility test
// check if number is div by 3 or 5 or just 3 or 5
class Programs{
	Scanner sc = new Scanner(System.in);
	int age,a,b;
	
	void DivisibilityTest() {
		System.out.println("Enter Number to Check divisibility: ");
		a = sc.nextInt();
		
		if(a == 0)
			System.out.println(a+ " is not divisible by 3 or 5");
		else if(a%3 == 0 && a%5 == 0)
			System.out.println(a+ " is divisible by 3 and 5");
		else if(a%3 == 0 && a%5!=0)
			System.out.println(a+ " is divibile by 3 but not 5");
		else if(a%3 != 0 && a%5==0)
			System.out.println(a+ " is divibile by 5 but not 3");
		
	}
	
	void Voting() {
		System.out.println("Enter age: ");
		age = sc.nextInt();
		
		if(age>=18)
			System.out.println("Eligible");
		else
			System.out.println("Not Eligible");
		
	}
	
	void PosNeg() {
		System.out.println("Enter Number to check positive negative: ");
		a = sc.nextInt();
		if(a==0)
			System.out.println("Number is neither positive nor negative");
		else if(a>0)
			System.out.println("Number is Positive");
		else
			System.out.println("Number is Negative");
	}
	
	void LargestNumber() {
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a == b)
			System.out.println("Numbers are equal");
		else if(a>b)
			System.out.println(a+" is greater than " + b);
		else
			System.out.println(b+" is greater than " + a);
	}
}

public class IfElseEX {

	public static void main(String[] args) {
		
		Programs p1 = new Programs();
		p1.Voting();
		p1.PosNeg();
		p1.LargestNumber();
		p1.DivisibilityTest();

	}

}
