package com.edu;

public class Palindrome1 {

	public static void main(String[] args) {
		// 342
		int num = 456, res =0 ;
		
		System.out.println(num);
		
		res += num%10;
		num = num/10;
		res = (res*10)+(num%10);
		num = num/10;
		res = (res*10)+(num%10);
		System.out.println(res);
		
	}

}
