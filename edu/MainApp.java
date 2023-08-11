package com.edu;

import java.util.*;

class Student{
  int studentid;
  String studentname;
  int studentage;
  
  void inputStudentData() {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Student ID: ");
	  studentid = sc.nextInt();
	  
	  System.out.println("Enter Student Name: ");
	  studentname = sc.next();
	  
	  System.out.println("Enter Student Age: ");
	  studentage = sc.nextInt();
	  
  }
  
  void displayStudentDetails(){
     System.out.println("Student id ="+studentid);
     System.out.println("Student name="+studentname);
     System.out.println("Student age ="+studentage);
   }

@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
  
}

public class MainApp{
     public static void main(String args[]){
              System.out.println("Main");
             
              Student sob = new Student();
              sob.inputStudentData();
              sob.displayStudentDetails();
              System.out.println(sob);
          }
}