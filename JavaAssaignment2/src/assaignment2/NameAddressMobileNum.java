package assaignment2;

import java.util.Scanner;

public class NameAddressMobileNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Address;
		String Name;
		String MobileNum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Address ");
		Address=sc.next();
		System.out.println("Enter the Name ");
		Name=sc.next();
		System.out.println("Enter the MobileNumber ");
		MobileNum=sc.next();
		System.out.println("The name is " + Name +" The Address is " + Address + " The MoblieNumber is " + MobileNum);
		
		
		
		

	}

}
