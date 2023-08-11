package com.edu;


import java.util.Scanner;

class DiscountCalculator1{
		
	int prod_price;
	String prod_name;
	//prod_price*0.05f
		
		void getData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Product Name: ");
			prod_name = sc.nextLine();
//			sc.nextLine();
			System.out.println("Enter product price: ");
			prod_price= sc.nextInt();
			
			
			
			showBill();
		}
		
		void showBill() {
			System.out.println("Product price: "+ prod_price);
			if(prod_price<0)
				System.out.println("Invalid Input");
			else if(prod_price<=10000) {
				System.out.println("Your discount is: "+ (prod_price*0.05));
				System.out.println("Your final price for "+prod_name+ " is: " + (prod_price-(prod_price*0.05)) );
			}
			else if(prod_price>10000 && prod_price<= 20000) {
				System.out.println("Your discount is: "+ (prod_price*0.10));
				System.out.println("Your final price for "+prod_name+ " is: " + (prod_price-(prod_price*0.10)) );
			}
			else if(prod_price>20000 && prod_price<= 35000) {
				System.out.println("Your discount is: "+ (prod_price*0.15));
				System.out.println("Your final price for "+prod_name+ " is: " + (prod_price-(prod_price*0.15)) );
			}
			else if(prod_price>35000) {
				System.out.println("Your discount is: "+ (prod_price*0.20));
				System.out.println("Your final price for "+prod_name+ " is: " + (prod_price-(prod_price*0.20)) );
			}
			
			getData();
		}

	
}

public class DiscountCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountCalculator1 d = new DiscountCalculator1();
		d.getData();

	}

}
