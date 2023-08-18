package com.edu;

//import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		int r,sum=0,temp;    
//		System.out.println("Enter Number: ");
//		int n= sc.nextInt();
		for(int i =1;i<=1000;i++) {
//			System.out.println(i);
			int n,r,sum=0,temp;
			n=i;
			temp=n;    	
			while(n>0){    
				r=n%10;   
				sum+= r*r*r;    
				n=n/10;    
			}    
			if(temp==sum)    
				System.out.println(i +" is Armstrong number ");    
//			else    
//				System.out.println(i +" is not Armstrong");
		}
}  
}
