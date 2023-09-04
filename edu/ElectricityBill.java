dpackage com.edu;


import java.util.Scanner;

class ElectricityBillGenerator{
	
	int unit;
	String name;
	
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = sc.nextLine();
//		sc.nextLine();
		System.out.println("Enter Units: ");
		unit = sc.nextInt();
		
		
		
		showBill();
	}
	
	void showBill() {
		if(unit <0)
			System.out.println("Invalid Input");
		else if(unit <=200)
			System.out.println(name +" Your electricity Bill is: " +(unit*3.80));
		else if(unit >200 && unit<= 300)
			System.out.println(name +" Your electricity Bill is: "+(760+((unit-200)*4.40)));
		else if(unit >300 && unit<= 400)
			System.out.println(name +" Your electricity Bill is: " +(1200+((unit-300)*5.10)));
		else if(unit >400)
			System.out.println(name +" Your electricity Bill is: " +(1710+((unit-400)*5.80)));
		
		getData();
	}
}

public class ElectricityBill {

	public static void main(String[] args) {
		ElectricityBillGenerator b1= new ElectricityBillGenerator();
		b1.getData();

	}

}
