package assaignment2;

import java.util.Scanner;

public class Number {
	private int num1;
	private int num2;
	private int total;
	Scanner sc =new Scanner(System.in);
	
	 public void accept() {
		 System.out.println("Enter the two numbers ");
		 
		 this.num1=sc.nextInt();
		 this.num2=sc.nextInt();
		 
		 
		 
	 }
	 public void display() {
		 total=num1+num2;
		 System.out.println("The Total is = " + total);
		 
		 
	 }
	

}
