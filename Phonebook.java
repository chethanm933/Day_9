package PhoneBook;

import java.util.ArrayList;
import java.util.List;




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
		Contact contact = new Contact();
			for (Contact obj : phoneBook) {
				if(obj.getPhoneNumber() == phonenumber) {
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
			for (Contact obj1:phoneBook) {
				if(obj1.getPhoneNumber() == phoneNumber) {
						f = true;
						phoneBook.remove(obj1);
						break;
					}
				}
				return f;
	}
} 
