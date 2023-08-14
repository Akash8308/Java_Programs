package com.edu;

import java.util.Scanner;

class MenudrivenCal{
	Scanner sc = new Scanner(System.in);
	int input=0;

	void arithmeticCalculator() {
		int a,b;
		
		while(input!=6) {
			System.out.println("\n1: Addition \n2: Subtraction \n3: Division \n4: Multiplication \n5: Area Calculator \n6: Exit \nEnter Your Choice: ");
			input = sc.nextInt();
			switch(input) {
			case 1: System.out.println("\n***** Addition ******");
					System.out.println("Enter two Numbers: ");
					a = sc.nextInt();
					b = sc.nextInt();
					System.out.println("Addition of "+ a +" and "+ b + " is: "+ (a+b));
			 		break;
			case 2: System.out.println("\n***** Subtraction ******");
					System.out.println("Enter two Numbers: ");
					a = sc.nextInt();
					b = sc.nextInt();
					System.out.println("Subtraction of "+ a +" and "+ b + " is: "+ (a-b));
			 		break;
			case 3: System.out.println("\n***** Division ******");
					System.out.println("Enter two Numbers: ");
					a = sc.nextInt();
					b = sc.nextInt();
					if(a ==0) {
						System.out.println("Cannot divide 0");
					 	break;
					}
					System.out.println("Division of "+ a +" and "+ b + " is: "+ (a/b));
			 		break;
			case 4: System.out.println("\n***** Multiplication ******");
					System.out.println("Enter two Numbers: ");
					a = sc.nextInt();
					b = sc.nextInt();
					System.out.println("Multiplication of "+ a +" and "+ b + " is: "+ (a/b));
			 		break;
			case 5: areaCal();
					break;	
			case 6: System.out.println("Exiting...");
//					sc.close();
			 		break;
			 default : System.out.println("Invalid Input");
			 
			}
		}
	}
	
	void areaCal() {
		double a,b;
		
		while(input!=6) {
			System.out.println("\n1: Area of Circle \n2: Area of Rectangle \n3: Area of Square \n4: Area of Trianle \n5: Arithmetic Calculator \n6: Exit \nEnter Your Choice: ");
			input = sc.nextInt();
			switch(input) {
			case 1: System.out.println("\n***** Area of Circle ******");
					System.out.println("Enter Radius: ");
					a= sc.nextDouble();
					System.out.println("Area of Circle is: "+ (3.14*(a*a)));
			 		break;
			case 2: System.out.println("\n***** Area of Rectangle ******");
					System.out.println("Enter Length: ");
					a= sc.nextDouble();
					System.out.println("Enter breadth: ");
					b= sc.nextDouble();
					System.out.println("Area of Rectangle is: "+ (a*b));
			 		break;
			case 3: System.out.println("\n***** Area of Square ******");
					System.out.println("Enter Side length: ");
					a= sc.nextDouble();
					System.out.println("rea of Square is: "+ (a*a));
			 		break;
			case 4: System.out.println("\n***** Area of Trianle ******");
					System.out.println("Enter length: ");					
					a= sc.nextDouble();
					System.out.println("Enter breadth: ");
					b= sc.nextDouble();
					System.out.println("Area of Trianle is: "+ (0.5*(a*b)));
			 		break;
			case 5: arithmeticCalculator();
					break;
			case 6: System.out.println("Exiting...");
//					sc.close();
			 		break;
			 default : System.out.println("Invalid Input");
			 
			}
		}
	}
}

public class MenuDrivenSwitch {

	public static void main(String[] args) {
		
		MenudrivenCal m = new MenudrivenCal();		
			m.arithmeticCalculator();
//			m.areaCal();
						

	}

}
