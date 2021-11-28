package assaignment2;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] arr =new int[7];
		System.out.println("Enter the array");
		
		for(int i=0;i<7;i++) {
			arr[i]=sc.nextInt();
			
			
			
		}
		for(int i=6;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
