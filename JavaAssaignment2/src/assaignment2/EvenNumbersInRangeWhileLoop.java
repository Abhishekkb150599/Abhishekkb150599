package assaignment2;

import java.util.Scanner;

public class EvenNumbersInRangeWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int i=num1;
		while(i<=num2) {
			if(i%2==0) {
				System.out.print(i +  " ");
				
				
				
			}
			i++;
			
			
			
			
		}
		
		
		
		
		
		

	}

}
