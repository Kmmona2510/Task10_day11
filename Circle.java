package tasks10_Day11;

import java.util.Scanner;

//Q3
  
//Create a class Circle
public class Circle {
	private int radius; //radius as datamember
	
  int num;
  

public Circle() {  // the constructor with no arguments
	  System.out.println("The construcor with no arguments");
	
}
     public Circle(int radius, int num) {  //the constructor with arguments
	this.radius=radius;
	this.num=num;
}
   
    public void calculate() {   //calculate method
    	
    	double c = num*Math.PI*radius;  //calculate circumference
    	System.out.println("Circle Circumference:" +c);
    }
    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //use scanner class to get value
		System.out.println("Enter the radius:");
		int r=sc.nextInt();
		
		Circle cir=new Circle();  //create object for constructor
		Circle cir2=new Circle(r,2); //create object for non parametarize constructor
		cir2.calculate();           //access calculate method
		
		

	}

}
