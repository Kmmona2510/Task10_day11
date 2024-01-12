package tasks10_Day11;

import java.util.Scanner;

//Q4
public class Account {  //create a class account

	private float balance;  //create balance as datamember
	float deposite;
	float withdraw;
	public Account() {  //create constructor
		System.out.println("The constructor with no parameters");
	}
	public Account(float bal,float dep) {   //create parametarized constructor
		System.out.println("with arguments");
		this.balance=bal;   //use this key word
		this.deposite=dep;
	}
	public void withdraw() { //create a withdraw method
		float wd = deposite-balance;
		System.out.println("Withdraw amount is:"+wd);
	}
	public void depositebalance() {  // create deposite balance method
		float depo = deposite+balance;
		System.out.println("Deposite Balance Amount is:" +depo);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  //use scanner class for getting input
		System.out.println("Enter the deposite Amount:");
		float dp=sc.nextFloat();
		System.out.println("Enter the Balance Amount:");
		float bal=sc.nextFloat();
		
		Account ac=new Account();   // create object for constructor
		Account ac1= new Account(bal,dp);  //create object for parametarized constructor
		ac1.withdraw();   //call withdraw method
		ac1.depositebalance();  //call deposite balance method

	}

}
