package com.edu;

import java.util.Scanner;

class CheckGrades{
	int marks;
	Scanner sc= new Scanner(System.in);
	
	void inputData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks: ");
		marks = sc.nextInt();
		sc.close();
		showData();
		
	}
	
	void showData() {
		if(marks<0 || marks>100)
			System.out.println("Invalid Marks");
		else if(marks >89 && marks<= 100)
			System.out.println("Grade: A");
		else if(marks >69 && marks<= 89)
			System.out.println("Grade: B");
		else if(marks >49 && marks<= 69)
			System.out.println("Grade: C");
		else if(marks >=0 && marks<= 49)
			System.out.println("Grade: D");
		
		inputData();
	}
}


class CheckMarks{
	char grade;
	
	void getData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter grade: ");
		grade = sc.next().charAt(0);
		showMarks();
	}
	void showMarks() {
		if(grade=='A' || grade=='a')
			System.out.println("Marks are between 90 to 100");
		else if(grade=='B' || grade=='b')
			System.out.println("Marks are between 70 to 89");
		else if(grade=='C' || grade=='c')
			System.out.println("Marks are between 50 to 69");
		else if(grade=='D' || grade=='d')
			System.out.println("Marks are between 0 to 49");
		else
			System.out.println("Invalid Input");
		
		getData();
	}
}


public class GradingUsingIfElse {

	public static void main(String[] args) {
		/*
		 90-100	 A
		 70-89 		 B
		 50-69		 C
		 0-49		 D
		 */
		CheckGrades u1 = new CheckGrades();
//		u1.inputData();
//		u1.showData();
		CheckMarks c1 = new CheckMarks();
//		c1.getData();
		
		
	}

}
