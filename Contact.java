package PhoneBook;



public class Contact {
	
	String First_Name;
	String Last_Name;
	String City;
	String State;
	String E_mail;
	Long Phone_Number;
		
	public  String getFirstName() {
		return First_Name;
	}
	
	public void setFirstName(String firstname) {
		this.First_Name = firstname;
		
	}
	
	public  String getCity() {
		return City;
	}
	
	
	public void setCity(String city) {
		this.City =city;
	}
	
	public  String getLastName() {
		return Last_Name;
	}
	
	
	public void setLastName(String lastname) {
		this.Last_Name = lastname;
		
	}
	
	
	public  String getState() {
		return State;
	}
	
	public void setState(String state) {
		this.State = state;
	}
	
	public  String getEmail() {
		return E_mail;
	}
	
	
	public void setEmail(String email) {
		this.E_mail = email;
	}
	
	public long getPhoneNumber() {
		return Phone_Number;
	}
	
	public void setPhoneNumber(long phonenumber) {
		this.Phone_Number = phonenumber;
	}
}
