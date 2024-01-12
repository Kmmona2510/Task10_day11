package tasks10_Day11;

import java.util.Scanner;

//Q2
 
public class Employee {  //create a class as employee
	
	private int id;    //create a datamembers
	private String FirstName;
	private String LastName;
	int Salary;
	int NewSalary;
	
	public Employee(int id,String FirstName,String LastName,int Salary) {    //create a  constructor
		System.out.println("Employee Constructor");
		this.id=id;                                      //using this key word
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Salary=Salary;
		
	}
	public String toString() {                         //create a method toString
		return "Employee[id="  + this.id +" "+ "name =" + this.FirstName+ " "  + this.LastName + " "+"salary=" + this.NewSalary + "]";

				
		
	}
	
		public int raiseSalary(int percent) {     //create a method raise salary
		NewSalary=getAnnualSalary() + percent;     //calculate the new salary
		
		return  NewSalary;                         // Return new salary as integer
	}
	
	public int getid() {      // get the id value
		return id;
	}
	public void setid() {
		this.id=id;
	}
	public void setFirstName() {
		this.FirstName=FirstName;
	}
	public String getFirstName() {       //get the firstname value
		return FirstName;
	}
	public void setLasttName() {
		this.LastName=LastName;
	}
	    public String getLastName() {         //get the Lastname value
	 	return LastName;
	}
          public String getName() {        //concat firstname and lastname
	      return FirstName+" "+LastName;
  }
      public int getSalary() {    //get the Salary value
	  return Salary;
	  
  }
      public void setSalary(int Salary) {     //set the Salary value
	  this.Salary=Salary;
	  
  } 
       public int getAnnualSalary() {   //get the AnnualSalary value
    	return Salary * 12; 
    }
	public static void main(String[] args) {
		
		
	   Scanner sc=new Scanner(System.in);   //Create a Scanner class for get the values from user
	  
	   System.out.println("Enter Id:");
	   int Id=sc.nextInt();
	   System.out.println("Enter the First Name:");
	   String firstname=sc.next();
       System.out.println("Enter the Last Name:");
       String lastname=sc.next();
       System.out.println("Enter Salary:");
       int salary =sc.nextInt();
       
       Employee obj=new Employee(Id,firstname,lastname,salary);       //create a object for the constructor
       System.out.println("The Get Employee id:" + (obj.getid()));         //print the values
       System.out.println("The Get Employee FirstName:" +(obj.getFirstName()));
       System.out.println("The Get Employee LastName:" +(obj.getLastName()));
       System.out.println("The Get Employee Salary:" +(obj.getSalary()));
       System.out.println("The Employee AnnualSalary:" +(obj.getAnnualSalary()));
       System.out.println("The FullName is:" + (obj.getName()));
    
       int Rsalary=obj.raiseSalary(1000);       //give arguments to risesalary
       System.out.println("The Rise Salary:" +Rsalary);
       
    System.out.println(obj.toString());    //print toString method
		
	}

}
