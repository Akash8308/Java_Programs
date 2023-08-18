package com.edu;

public class PrimeNumber {

	public static void main(String[] args) {
		int c=0, cn=0;
		for(int i=100;i>=1;i--) { 
			c=0;
			for(int j=1;j<=i;j++) { 
				if(i%j==0) {  
					c++; 
					//System.out.println(c)
				}
			}
			if(c==2) {
				cn++;
				System.out.print(i+" ");
				if(cn == 3)
				{
					break;
				}
			}
			
		}

	}

}