package LAB13_04;

import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private Date dob;
	private String nationality;

	public void printName() {
		System.out.println("Name: " + firstName + " " + lastName);
	}

	public void printDetail() {
		System.out.println("DOB: " + dob.toString() + ", Nationality: " + nationality);
	}
}
