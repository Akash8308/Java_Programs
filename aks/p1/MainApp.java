package com.edubridge.pack1;

import com.edubridge.pack2.HR;
import com.edubridge.pack2.Sales;

import com.edu.aks

//default, protected, public
class Employee extends HR{
	private int i;
	
	private void empPersonalDetails() {
		System.out.println("empPersonalDetails");
	}
	public void display() {
		System.out.println("display method "+id);
		System.out.println("display method "+name);
		empPersonalDetails();
	}
}
public class MainApp {

	public static void main(String[] args) {
		Employee eob = new Employee();
		eob.input();
		eob.display();
		
		//HR hob=new HR();
//		hob.input();
//	     hob.display();
//	     
//	     Sales sob=new Sales();

	}

}