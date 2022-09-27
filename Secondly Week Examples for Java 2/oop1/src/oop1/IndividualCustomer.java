package oop1;

//ÝNHERÝTENCE : miras almak EXSTENDS :geniþletmek
public class IndividualCustomer extends Customer { // Bireysel müþteri bir müþteridir demektir.
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
