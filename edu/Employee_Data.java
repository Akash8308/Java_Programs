package com.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Employee_Data {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//Eid ,Ename, Eage, Esalary, Edepartment, Egender
		int eid, eage;
		Double esalary;
		String edepartment,  ename;
		char egender;
		System.out.println("Enter Employee ID: ");
		eid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee name: ");
		ename = sc.nextLine();
		
		System.out.println("Enter Employee Age: ");
		eage = sc.nextInt();
		
		
		System.out.println("Enter Employee Salary: ");
		esalary = sc.nextDouble();
		
		System.out.println("Enter Employee Department: ");
		edepartment = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter Employee Gender: ");
		egender = sc.next().charAt(0);
		
		System.out.println("Entered Details are:");
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee ID: " + eid);
		System.out.println("Employee Age: " + eage);
		System.out.println("Employee Salary: " + esalary);
		System.out.println("Employee Department: " + edepartment);
		System.out.println("Employee Gender: " + egender);

	}

}
