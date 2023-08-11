package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeDataUsingBufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//Eid ,Ename, Eage, Esalary, Edepartment, Egender
		int eid;
		String ename;
		float esalary;
		char egender;
		System.out.println("Enter Employee ID: ");
		eid = Integer.parseInt(br.readLine());
		
		System.out.println("Enter name");
		ename=br.readLine();
		
		System.out.println("Enter Salary");
		 esalary = Float.parseFloat(br.readLine());
		 
		 System.out.println("Enter Gender");
		 egender = (char)br.read();
		 
		 
		 System.out.println("Student Details");
		 System.out.println("Id="+eid);
		 System.out.println("Name="+ename);
		 System.out.println("Salary="+esalary);
		 System.out.println("Gender="+egender);

	}

}
