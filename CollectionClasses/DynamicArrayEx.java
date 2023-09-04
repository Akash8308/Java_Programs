package CollectionClasses;	

import java.util.*;


public class DynamicArrayEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> intList = new ArrayList();
//		ArrayList<String> strList = new ArrayList();
//		ArrayList<Double> doubleList = new ArrayList();
//		
//		intList.add(101);
//		strList.add("Hello Akash");
//		doubleList.add((double) 101010101);
//		intList.add(sc.nextInt());
//		
//		System.out.println(intList);
//		System.out.println(strList);
//		System.out.println(doubleList);
		
		System.out.println("Enter Five elements: ");
		for(int i=0;i<5;i++) {
			intList.add(sc.nextInt());
		}
		System.out.println("Enter the number you want to search and remove: ");
		int search = sc.nextInt();
		if(intList.contains(search))
			System.out.println("Element is present at location: " + (intList.indexOf(search)+1));
		else
			System.out.println("Element is absent");
		
		System.out.println("Removed " + (intList.remove(intList.indexOf(search))));
		
		System.out.println(intList);
		
		
	}

}
