package com.edu;

import java.util.Scanner;

public class MainAppp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,res;
		
		System.out.println("Enter four numbers:");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		d= sc.nextInt();
		
		res = (a>b && a>c && a>d)? a:(b>a && b>c && b>d)? b:(c>a && c>b && c>d)?c:d;
		
		System.out.println("The Largest number in " + a +  " "+ b+  " "+ c + " " + d+  " is " + res);
		
		

	}

}
