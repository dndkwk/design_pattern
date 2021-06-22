package LAB13_04;

import java.util.Date;

public class Company {
	private String name;
	private String companyType;
	private Date incorporated;

	public void printName() {
		System.out.println("Name: " + name + " " + companyType);
	}

	public void printDetail() {
		System.out.println("Incorporated: " + incorporated.toString());
	}
}
