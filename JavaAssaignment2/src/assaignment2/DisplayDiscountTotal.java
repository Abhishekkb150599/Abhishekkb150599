package assaignment2;

import java.util.Scanner;

public class DisplayDiscountTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 5 numbers ");
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		int num5=sc.nextInt();
		
		int Total=num1+num2+num3+num4+num5;
		System.out.println("Total is " +Total);
		int Discount=((10*Total)/100);
		System.out.println("Discount is "+ Discount);
		int finalTotal=Total-Discount;
		System.out.println("Final total after discount " +finalTotal);
		
		
		
		
		
		

	}

}
