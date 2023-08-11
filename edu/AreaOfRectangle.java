package com.edu;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l,b;
		System.out.println("Enter Length: ");
		l = sc.nextInt();
		System.out.println("Enter breadth: ");
		b = sc.nextInt();
		System.out.println("Area of Rectangle is: " + (l*b));
	}

}
