package assaignment2;

import java.util.Scanner;

public class Circle {
	private int radius;
	private double result;
	Scanner sc=new Scanner(System.in);
	final double pi=(22/7);
	
	
	public void accept() {
		System.out.println("Enter the radius ");
		this.radius=sc.nextInt();
	
		
	}
	public void calculateArea() {
		this.result=(pi*radius*radius);
		
		
	}
	public void displayArea() {
		System.out.println("The area of the circle is "+ result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle();
		obj.accept();
		obj.calculateArea();
		obj.displayArea();
	}

}
