package PhoneBook;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = 0;
	
		
		Phonebook phonebook = new Phonebook();
		
		
		while (i == 0) {
			System.out.println("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Edit \n6.Exit");
			n = sc.nextInt();
				
		if(n == 1) {
			 Contact contacts = new Contact();
			 
			 System.out.println("Add a contact: ");
			 int temp = sc.nextInt();
			 
			 System.out.println("----------------------");
			 
             System.out.println("1Enter the First Name: ");
             contacts.setFirstName(sc.nextLine());
             
             System.out.println("Enter the last Name: ");
             contacts.setLastName(sc.nextLine());
              
             System.out.println("Enter the city: ");
             contacts.setCity(sc.nextLine());
             
             System.out.println("Enter the State: ");
             contacts.setState(sc.nextLine());
             
             System.out.println("Enter the Email: ");
             contacts.setEmail(sc.nextLine());
             
             System.out.println("Enter the Phonenumber: ");
             contacts.setPhoneNumber(sc.nextLong());
             
             System.out.println("----------------------");
             
             phonebook.addPhoneBook(contacts);
		}
		
		if(n == 2) {
			
			System.out.println("the contacts avaliable in the list are :");
			List<Contact> contact = phonebook.viewAllContacts();
			
				for(Contact temp: contact) {
					System.out.println("first name :"+temp.getFirstName());
					System.out.println("last name :"+temp.getLastName());
					System.out.println("phone number :"+temp.getPhoneNumber());
					System.out.println("city name :"+temp.getCity());
					System.out.println("state name :"+temp.getState());
					System.out.println("email :"+temp.getEmail());
					 System.out.println("----------------------");
				
				}
		}
		
		if(n==3) {
			
			System.out.println("enter the phone number to ");
			long number = sc.nextLong();
			Contact view = phonebook.viewContactGivenPhone(number);
			System.out.println("the contact is :");
			System.out.println("the firstname :"+view.getFirstName());
			System.out.println("the lastname :"+view.getLastName());
			System.out.println("the phone :"+view.getPhoneNumber());
			System.out.println("the city :"+view.getCity());
			System.out.println("the state :"+view.getState());
			System.out.println("the email :"+view.getEmail());
			 System.out.println("----------------------");
		}
		
		if(n == 4) {
			System.out.println("enter the contact number that you want to delete :");
			long number = sc.nextLong();
			phonebook.removeContact(number);
			System.out.println("the number is successfully deleted :");
			 System.out.println("----------------------");
		}

		if(n == 5) {
			Contact contacts = new Contact();
			System.out.println("enter the number that you want to edit :");
			long number = sc.nextLong();
			phonebook.editContact(number);
//			System.out.println("enter the new number :");
//			long newnumber = sc.nextLong();
//			contacts.setPhoneNumber(newnumber);
			System.out.println("----------------------");
			
		}
		
			if(n == 6) {
			System.exit(0);
			}
		
		} 
	}
}
