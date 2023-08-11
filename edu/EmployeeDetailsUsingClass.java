package com.edu;

import java.util.Scanner;

class EmplyoeeDetails{
	int emp_ID,emp_Age, emp_Salary;
	String emp_Name,emp_Department;
	
	void inputDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID:");
		emp_ID = sc.nextInt();
		
		System.out.println("Enter Employee Name: ");
		emp_Name = sc.next();
		
		System.out.println("Enter Employee Age: ");
		emp_Age = sc.nextInt(); 
		
		System.out.println("Enter Employee Department: ");
		emp_Department = sc.next();
		
		System.out.println("Enter Employee Salary: ");
		emp_Salary = sc.nextInt();		
	}
	
	@Override
	public String toString() {
		return "EmplyoeeDetails [emp_ID=" + emp_ID + ", emp_Age=" + emp_Age + ", emp_Salary=" + emp_Salary
				+ ", emp_Name=" + emp_Name + ", emp_Department=" + emp_Department + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	void showDetails() {
		System.out.println("Employee details are: ");
		System.out.println("Employee ID " + emp_ID);
		System.out.println("Employee Name: " + emp_Name);
		System.out.println("Employee Age: " + emp_Age);
		System.out.println("Employee Department: " + emp_Department);
		System.out.println("Employee Salary: " + emp_Salary);
	}
	
}

public class EmployeeDetailsUsingClass {

	public static void main(String[] args) {
		EmplyoeeDetails e1 = new EmplyoeeDetails();
		EmplyoeeDetails e2 = new EmplyoeeDetails();
		
		e1.inputDetails();
		e1.showDetails();
		System.out.println(e1);
		
		e2.inputDetails();
		e2.showDetails();
		System.out.println(e2);

	}

}
