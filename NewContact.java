package PhoneBook;

import java.util.Scanner;

public class NewContact {
	
	String Name;
	String Last_Name;
	String Address;
	String City;
	String State;
	int Zip_code;
	int Phone_Number;
	String E_mail;
	
	public void newContact(String Name, String Last_Name, String Address, String City, String State, int Zip_code, int Phone_Number, String E_mail)  {
		
		this.Name = Name;
		this.Last_Name = Last_Name;
		this.Address = Address;
		this.City = City;
		this.State = State;
		this.Zip_code = Zip_code;
		this.Phone_Number = Phone_Number;
		this.E_mail = E_mail;
		
		System.out.println("Name :"+Name+"\nLast name :"+Last_Name+"\nAddress :"+Address+"\nCity :"+City+"\nState :"+State+"Zip-code :"+Zip_code+"\nPhone number :"+Phone_Number+"\nEmail :"+E_mail);
		System.out.println("------------");
		
	}

	public static void main(String[] args) {
		
		NewContact addressbook = new NewContact();
		addressbook.newContact("CHETHAN", "M", "BANGLORE", "BANGLORE", "KARNATAKA", 560063, 888888888, "CHETHANM933@GMAIL.COM");
	
		addressbook.newContact("kiran", "m b", "smet", "bdvt", "kar", 577301, 888899999, "kiranmb@gmail.com");
	}
	
}

	

	

