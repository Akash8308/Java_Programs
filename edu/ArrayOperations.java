package com.edu;

import java.util.Scanner;

public class ArrayOperations{
	 int age;
	 String name;
	void input(){
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter student name");
	     name = sc.nextLine();
	     
	     System.out.println("Enter age");
	     age = sc.nextInt();
	  }
	  void display(){
	      System.out.println("Name ="+name);
	       System.out.println("Age="+age);
	  }
	public static void main(String args[]){
		//array of Student
		ArrayOperations s[]=new ArrayOperations[5];  
		
	for(int i=0;i<s.length;i++) { //s[0]
		s[i] = new ArrayOperations();
			
		}
		System.out.println("Enter "+s.length+" student details");
		for(int i=0;i<s.length;i++) {
			s[i].input();
			
		}
		
		System.out.println("Details of students");
		for(int i=0;i<s.length;i++) {
			s[i].display();
			
		}
	  
	  
	  
	}
	}