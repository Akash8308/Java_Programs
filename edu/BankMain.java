package com.edu;

import java.util.Scanner;

/*abstract class Bank{
	 abstract  float rateOfInterest();
	}

	class HdfcBank extends Bank{
	      float rateOfInterest(){
	             return 6.3f;
	      }
	}

	class SbiBank extends Bank{
	      float rateOfInterest(){
	             return 7.5f;
	      }
	}
	class CitiBank extends Bank{
	      float rateOfInterest(){
	             return 8f;
	      }
	}
	public class BankMain{
	        public static void main(String args[]){
	        	HdfcBank b1 = new HdfcBank();
	        	SbiBank b2 = new SbiBank();
	        	CitiBank b3 = new CitiBank();
	        	 
	        	Bank b = new HdfcBank();
	        	System.out.println("Rate of Inrest is: " + b.rateOfInterest());
	        	System.out.println("Rate of Inrest is: " +b1.rateOfInterest());
	        	System.out.println("Rate of Inrest is: " +b2.rateOfInterest());
	        	System.out.println("Rate of Inrest is: " +b3.rateOfInterest());
	        	System.out.println("--");
	      }
	}*/





//class BankException extends Exception{
//    /**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	public BankException(String s)
//    {
//          super(s);
//     }
//}
//
//class Bank{
//     float amt;
//     public Bank(){
//            amt=1000;
//     }
//       public void depositAmount(float damt){
//           try{
//               if(damt<=0){
//                   throw new BankException ("Deposit amout should greater than zero");
//               }
//               else {
//               amt=amt+damt;
//               System.out.println("Amout after deposit "+ amt);
//               }
//           }
//           catch(BankException e){
//               e.printStackTrace();
//           }
//             
//        }
//
//    //withdraw
//     public void withdrawAmt(float wamt){
//              try{
//                if(wamt<=0 ){
//                  throw new BankException ("Withdraw amout should greater than zero"); 
//               }
//
//             else if(wamt>amt){
//                  throw new BankException ("Insufficient Balance"); 
//                }
//             else {
//            	 amt=amt-wamt;
//            	 System.out.println("Please collect Rs."+wamt);
//                 System.out.println("After withdraw your bank balance is "+amt);
//             }
//            
//            }
//         catch(BankException e){
//               e.printStackTrace();
//           }
////              return amt;
//
//           }//withdrawAmt
//      }//class
//
//
//
//public class BankMain{
//     public static void main(String args[]){
//    	 Scanner sc = new Scanner(System.in);
//    	 Bank bob=new Bank();
//         int ch =0;
//         float uamt=0;
//         while(ch!=3) {
//            System.out.println("Enter your choice");
//            System.out.println("1.Deposit");
//            System.out.println("2.Withdraw");
//            System.out.println("3.Exit");
//            ch = sc.nextInt();
//              
//            switch(ch){
//            	case 1: System.out.println("Enter amount to deposit");
//            			uamt=sc.nextFloat();
//            			bob.depositAmount(uamt);
//            				break;
//            	case 2: System.out.println("Enter amount to withdraw");
//            			uamt=sc.nextFloat();
////                     	float bal=bob.withdrawAmt(uamt);
//            				break;
//            	case 3: System.out.println("Terminated");
//            			System.exit(0);
//                default: System.out.println("Invalid option");
//            }
//               
//         }
//                  
//               
//     }
//}



class MyBank{
	float amt;
	
	public MyBank() {
		amt=1000;
	}
	
	synchronized public void deposit(float damt) {
	 System.out.println("Inside depoist method");
		amt=amt+damt;
		notify();
	}

 	synchronized public void withdraw(float wamt) throws InterruptedException {
	if(wamt>amt) {  
		System.out.println("Insufficient balance need to deposit fisrt");
		wait();
		System.out.println("After wait");
	   amt=amt-wamt;  
	   System.out.println("Balance after withdraw "+amt);
	}
	else {
		System.out.println("You can withdraw money");
		
		 amt=amt-wamt;
		 System.out.println("Balance after withdraw "+amt);
		
	}
   }
}
public class BankMain {

	public static void main(String[] args) {
		MyBank bob=new MyBank();
		Thread t1=new Thread() {
			public void run() {
					
						try {
							bob.withdraw(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
		};
		t1.start();
		
		Thread t2=new Thread() {
			public void run() {
			
					bob.deposit(4000);
				
			}
			
		};
		t2.start();
	}

}