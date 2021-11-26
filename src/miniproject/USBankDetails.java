package miniproject;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class USBankDetails {

	HashMap <String, ComplaintDetails> bankDetailsObject = new HashMap<>();
	public void fileloader() {
	String path= "C:\\Users\\Win 10\\Downloads\\complaints.csv";
	String line="";
	try {
	BufferedReader bf = new BufferedReader(new FileReader(path));
	while((line=bf.readLine())!=null) {
	String[] elements = line.split(",");
	ComplaintDetails objcompdet = new ComplaintDetails(); 
	objcompdet.dateReceived = elements[0];
	objcompdet.product = elements[1];
	objcompdet.subProduct = elements[2];
	objcompdet.issue = elements[3];
	objcompdet.subIssue = elements[4];
	objcompdet.company = elements[5];
	objcompdet.state = elements[6];
	objcompdet.ZIPcode = elements[7]; 
	objcompdet.submittedVia = elements[8];
	objcompdet.dateSentToCompany = elements[9];
	objcompdet.companyResponseToConsumer = elements[10];
	objcompdet.timelyResponse=elements[11];
	objcompdet.consumerDisputed=elements[12];
	objcompdet.complainId = elements[13];

	bankDetailsObject.put(elements[13], objcompdet);
	}

	bf.close();

	} catch (FileNotFoundException e) {

	  e.printStackTrace();

	} catch (IOException e) {
	 e.printStackTrace();
	}

	}
	HashMap<String, ComplaintDetails> bankdetailsobject() {
		return bankDetailsObject;
	}
}


	

