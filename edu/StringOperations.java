package com.edu;

import java.util.Scanner;



class CountVowelsInWord{
	Scanner sc = new Scanner(System.in);
	StringBuilder s2 = new StringBuilder();
	StringBuilder s3 = new StringBuilder();
	String s1= null;
//	String s2 = null;
	int count=1;
	void getString() {
		System.out.println("Enter a Word: ");
		s1=sc.nextLine();
		s1.toLowerCase();
//		countVowels();
//		countWords();
//		revWord();
	}
	
	void revWord() {
		// Akash Hedau
		// hsaka uadeh
		
		if(s1 == null) {
			System.out.println("String is epmty");
		}
		else {
			for(int i =0;i<s1.length();i++) {
				if(s1.charAt(i) != ' ') {
					s2.append(s1.charAt(i));
				}
				else{
					s2.reverse();
					s3.append(s2);
					s3.append(" ");
					s2.delete(0, s2.length());					
				}
				if(i == s1.length()-1){
//					s3.append(" ");
					s2.reverse();
					s3.append(s2);				
				}
					
			}
			System.out.println("Reverse Word is: "+s3);
			
		}
	}
	
	void countVowels() {
		int VowelCount =0;
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
				VowelCount++;
			}
		}
		System.out.println("Number of vowels: " + VowelCount);
	}
	
	void showString() {
		System.out.println(s1);
	}
	
	void countWords() {
		if(s1 == null) {
			System.out.println("String is empty");
			return;
		}
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i) == ' ' && s1.charAt(i+1) != ' ') {
				count++;
			}
		}
		System.out.println("Number of words: " + count);
	}
}

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountVowelsInWord c = new CountVowelsInWord();
		c.getString();
//		c.showString();
		c.countVowels();
		c.countWords();
		c.revWord();
	}

}
