package tasks10_Day11;

import java.util.Scanner;

//Q1  Create a Class as person
public class Person {
	private String Name;
	private int age;
	
		
	public Person(String Name,int age) {   //create a constructor
		System.out.println("");
		System.out.println("Constructor");
		this.Name=Name;     //initiate this keyword for parameters
		this.age=age;
	}
	public String getName() {  //create getName method
		return Name;
	}
	
	public int getage() {      //create getage method
		return age;
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   //using Scanner class
		
		System.out.println("Enter the Name:");  //to get name from user
		String name=sc.next();
		
		System.out.println("Enter the age");  //to get age from user
		int age=sc.nextInt();
	
		Person obj=new Person(name,age);   //to create object for constructor with arguments 
		System.out.println("The getName is:" +(obj.Name));  //print name
		System.out.println("The getAge is:" +(obj.age));  //print age

	}

}
