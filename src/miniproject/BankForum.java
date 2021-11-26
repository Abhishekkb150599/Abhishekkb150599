package miniproject;

	import java.util.Scanner;

	public class BankForum {

		public static void main(String[] args) {
			ComplaintDetailFetcher fetch = new ComplaintDetailFetcher();
			((ComplaintDetailFetcher) fetch).loadData();
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome User! Select your query.");
			System.out.println("Choose your query between 1 to 7."+sc);
			System.out.println("1.Display all the complaints in the year provided by the user");
			System.out.println("2.Display all the complaints based on the name of the bank provided by the user.");
			System.out.println("3.Display complaints based on the complaint Id provided by the user ");
			System.out.println("4.Display all the complaints closed/closed with explanation"); 
			System.out.println("5.Display all the complaints which received a timely response");
			int option = sc.nextInt();
			sc.nextLine();
			switch (option)
			{
			case 1:
			System.out.println("Enter year: "); 
			String year = sc.next();
			fetch.complaintsBasedonYear(year);
			break;

			case 2:
			System.out.println("Enter company name: "); 
			String u_company = sc.next();
			fetch.complaintsBasedOnCompany(u_company);
			break;

			case 3:
			System.out.println("Enter complaint Id: "); 
			String id = sc.next();
			fetch.complaintsBasedonComplaintID(id);
			break;
			
		/*
		 * case 4: System.out.println("Enter complaint ID:"); String compid = sc.next();
		 * fetch.noOfDaysToClosecomplaint(compid); break;
		 */
			

			case 4: System.out.println("Closed Complaints: "); 
			fetch.complaintsClosed(); 
			break;
			
			case 5:
			System.out.println("Complaints processed timely: ");
			fetch.complaintsteceivingTimelyResponse();
			break;
			
		/*
		 * case 7: System.out.println("write your complaint here: "); String complaint =
		 * sc.next(); fetch.writeComplaint(complaint); break;
		 */
			
			default: System.out.println("Enter valid option ");
			sc.close();
			}

		}

	}



