//2015112232백근주
package LAB10_04;

public class MedVolCustomer extends Customer {
	String type = "medium";
	String name;
	String company;

	MedVolCustomer(String name, String company) {
		this.name = name;
		this.company = company;
	}

	@Override
	Customer clone(String name, String company) {
		return new MedVolCustomer(name, company);
	}
}
