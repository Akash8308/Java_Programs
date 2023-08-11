package com.edu;


import java.util.Scanner;

class DiscountCalculator{
		
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
			else if(prod_price<=1000) {
				System.out.println("Your discount is: Rs."+ (prod_price*0.02));
				System.out.println("Your final price for "+prod_name+ " is: " + (prod_price-(prod_price*0.02)) );
			}
			else if(prod_price>1000 && prod_price<= 3000) {
				System.out.println("Your discount is: Rs."+ (prod_price*0.10));
				System.out.println("Your final price for "+prod_name+ " is: " + (prod_price-(prod_price*0.10)) );
			}
			else if(prod_price>3000 ) {
				System.out.println("Your discount is: Rs."+ (prod_price*0.15));
				System.out.println("Your final price for "+prod_name+ " is: " + (prod_price-(prod_price*0.15)) );
			}
			
			getData();
		}

	
}
public class DiscountCal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountCalculator d = new DiscountCalculator();
		d.getData();

	}

}
