package oop1;

//İNHERİTENCE : miras almak EXSTENDS :genişletmek
public class IndividualCustomer extends Customer { // Bireysel müşteri bir müşteridir demektir.
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
