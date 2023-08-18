package com.edu;

import java.util.Scanner;

public class ForExapmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final long startTime = System.currentTimeMillis();
//
//		for(int i=1;i<=100000;i++) {
//			System.out.println("Hello Akash " + i);
//		}
//		final long endTime = System.currentTimeMillis();
//
//		System.out.println("Total execution time: " + (endTime - startTime)+"ms");
		
		        Scanner sc = new Scanner(System.in);
		         int i,fact=1;  
		        int number= sc.nextInt(); 
		        for(i=1;i<=number;i++){    
		            fact=fact*i;    
		        }   
		        System.out.println(fact);    
		        
		        
		  
		}
	}


