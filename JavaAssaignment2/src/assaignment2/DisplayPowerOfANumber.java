package assaignment2;

import java.util.Scanner;

public class DisplayPowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1=0;
		double num2=0;
		System.out.println("enter the number ");
		
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=10 && num<=100) {
			num2=num%10;
			num1=num/10;
			
			
		}
		System.out.println(Math.pow(num1,num2));
		
		

	}

}
