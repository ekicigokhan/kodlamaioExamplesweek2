package oop1;

//�NHER�TENCE : miras almak EXSTENDS :geni�letmek
public class IndividualCustomer extends Customer { // Bireysel m��teri bir m��teridir demektir.
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
