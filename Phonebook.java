package PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phonebook {
	

	private List<Contact> phoneBook = new ArrayList<Contact>();
	
	
	
	public void setPhoneBook(List<Contact> phonebook) {
		phoneBook = phonebook;
		
	}
	 
	public void addPhoneBook(Contact newcontact) {
		phoneBook.add(newcontact);
	}

	public List<Contact> viewAllContacts() {
		return phoneBook;
	}
	
	public List<Contact> editContact(long phonenumber) {
			for (Contact edit : phoneBook) {
				if( edit.getPhoneNumber() == phonenumber) {
				System.out.println("enter the new number :");
				Scanner sc = new Scanner(System.in);
				edit.setPhoneNumber(sc.nextLong());
				} else {
					System.out.println("phone number does not exist");
				}
			}
		return phoneBook;
	} 
	
	public Contact viewContactGivenPhone(long Phonenumber) {
		Contact contact = new Contact();
			for(Contact obj: phoneBook) {
				if (obj.getPhoneNumber() == Phonenumber) {
					contact = obj;
				}
			}
			return contact;
	}
			
	public boolean removeContact (long phoneNumber) {
		boolean f = false;
			for (Contact contact1:phoneBook) {
				if(contact1.getPhoneNumber() == phoneNumber) {
						f = true;
						phoneBook.remove(contact1);
						break;
					}
				}
				return f;
	}
} 
