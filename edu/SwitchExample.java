package com.edu;

import java.util.Scanner;

class SwitchMethods{
	void dayByNum() {
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("Enter the day number"); 
		day = sc.nextInt();
		switch(day) {
		case 1: System.out.println("Monday,First day of the week"); 
				break;
		case 2: System.out.println("Tuesday,Second day of the week"); 
				break;
		case 3: System.out.println("Wednesday,Third day of the week"); 
				break;
		case 4: System.out.println("Thursday, Fourth day of the week"); 
				break;
		case 5: System.out.println("Friday,Fifth day of the week"); 
				break;
		case 6: System.out.println("Saturday, Sixth day of the week"); 
				break;
		case 7: System.out.println("Sunday, Seventh day of the week"); 
				break;
		default: System.out.println("Invalid Input");
		}
	}
	
	void numByDay() {
		Scanner sc = new Scanner(System.in);
		String day;
		System.out.println("Enter the day: "); 
		day = sc.next().toLowerCase();
		switch(day) {
		case "monday": System.out.println("Monday,First day of the week"); 
				break;
		case "tuesday": System.out.println("Tuesday,Second day of the week"); 
				break;
		case "wednesday": System.out.println("Wednesday,Third day of the week"); 
				break;
		case "thursday": System.out.println("Thursday, Fourth day of the week"); 
				break;
		case "friday": System.out.println("Friday,Fifth day of the week"); 
				break;
		case "saturday": System.out.println("Saturday, Sixth day of the week"); 
				break;
		case "sunday": System.out.println("Sunday, Seventh day of the week"); 
				break;
		default: System.out.println("Invalid Input");
		}
	}
	
	void vowels() {
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("Enter the Character: "); 
		c = sc.next().charAt(0);
		switch(c) {
		case 'a' : System.out.println(c+ " is Vowel"); 
				break;
		case 'A' : System.out.println(c+ " is Vowel"); 
				break;
		case 'e' | 'E': System.out.println(c+ " is Vowel"); 
				break;
		case 'E' : System.out.println(c+ " is Vowel"); 
				break;
		case 'i': System.out.println(c+ " is Vowel"); 
				break;
		case 'I' : System.out.println(c+ " is Vowel"); 
				break;
		case 'o': System.out.println(c+ " is Vowel"); 
				break;
		case 'O' : System.out.println(c+ " is Vowel"); 
				break;
		case 'u': System.out.println(c+ " is Vowel"); 
				break;
		case 'U' : System.out.println(c+ " is Vowel"); 
				break;
		default: System.out.println(c+ " is not Vowel");
		}
		
	}
	
}

public class SwitchExample{
	public static void main(String args[]){ 
		SwitchMethods s = new SwitchMethods();
		s.dayByNum();
		s.numByDay();
		s.vowels();
		System.out.println("Exiting...");
		
	}
}