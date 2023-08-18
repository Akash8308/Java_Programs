package com.edu;

import java.util.Scanner;

class Arrayfunctions{
	Scanner sc = new Scanner(System.in);
	
	int arr[] = null;
	int size;
	
	void getArray() {
		System.out.println("Enter size of array: ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " +size+ " elements: ");
		for(int i =0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	void printArray() {
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
}

public class ArrayDemo {
	public static void main(String args[]) {
		
		Arrayfunctions a = new Arrayfunctions();
		a.getArray();
		a.printArray();
	}
}
