package com.edu;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		int r=sc.nextInt();
		double p=3.14;
		System.out.println("Area of circle is: " + p*(r*r));
	}

}
