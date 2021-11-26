package miniproject;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

public class ComplaintDetailFetcher {

	USBankDetails tablefile =  new USBankDetails();
	Scanner sc = new Scanner(System.in);
	
	void loadData() {
		tablefile.fileloader();
	}
	
	void complaintsBasedonYear(String year) {
	     for (HashMap.Entry<String, ComplaintDetails> entry : tablefile.bankdetailsobject().entrySet()) {
	    	 DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    	 System.out.println("value: "+LocalDate.parse(entry.getValue().dateReceived, formatter));
	    	 int receivedDateYear = LocalDate.parse(entry.getValue().dateReceived, formatter).getYear();
				 if(Integer.valueOf(receivedDateYear).toString().equals(year)) {
					 System.out.println(entry.getValue().issue);
				     System.out.println("Complaint addressed in"+
				     NoOfDaysToCloseComplaint(entry.getValue().dateReceived,
				     entry.getValue().dateSentToCompany)); 
				 }
				 
	     }
	}
	
	void complaintsBasedOnCompany (String u_company) {
		for (HashMap.Entry<String, ComplaintDetails> entry : tablefile.bankdetailsobject().entrySet()) {
			if(entry.getValue().company.equalsIgnoreCase(u_company)) {
				System.out.println(entry.getValue().issue +" "+u_company);
				//System.out.println("Complaint addressed in"+ NoOfDaysToCloseComplaint(entry.getValue().dateReceived, entry.getValue().dateSentToCompany));
			}

		}
	}
	
	void complaintsBasedonComplaintID(String id) {
	int check=0;

	for (HashMap.Entry<String, ComplaintDetails> entry : tablefile.bankdetailsobject().entrySet()) {
		if(entry.getKey().equals(id)) {
			System.out.println("ComplaintDetailsBased on Id: "+entry.getValue().issue);
			System.out.println("Complaint addressed in"+ NoOfDaysToCloseComplaint(entry.getValue().dateReceived, entry.getValue().dateSentToCompany));
			check = 1;
		}
	}
	if (check==0) {
		System.out.println("Complaint ID not found...");
	}
	}
	
	long NoOfDaysToCloseComplaint(String receivedDate, String dateSentToCompany) {
		LocalDate recDate = LocalDate.parse(receivedDate);
		LocalDate sentDate = LocalDate.parse(dateSentToCompany);
		return ChronoUnit.DAYS.between(recDate, sentDate);
	}
	
	void complaintsteceivingTimelyResponse() {
		for (HashMap.Entry<String, ComplaintDetails> entry : tablefile.bankdetailsobject().entrySet()) {
			if(entry.getValue().timelyResponse.equals("Yes")) {
				System.out.println(entry.getValue().dateReceived +" "+entry.getValue().product
						+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "
						+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+
						entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+ entry.getValue().consumerDisputed+"\n");
			}
		}
	}
	
	void complaintsClosed() {
		for (HashMap.Entry<String, ComplaintDetails> entry : tablefile.bankdetailsobject().entrySet()) {
			String complaintsClosed = entry.getValue().companyResponseToConsumer;
			if(complaintsClosed.equalsIgnoreCase("Closed") || complaintsClosed.equalsIgnoreCase("Closed with explanation")) {
				  System.out.println(entry.getValue().dateReceived +" "+entry.getValue().product
							+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "
							+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+
							entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+ entry.getValue().consumerDisputed+"\n");
			}
		}
	}
}



			
		
	
	
	
	
	
	
