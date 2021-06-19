//2015112232백근주
package LAB10_04;

public class LoVolCustomer extends Customer {
	String type = "low";
	String name;
	String company;

	LoVolCustomer(String name, String company) {
		this.name = name;
		this.company = company;
	}

	@Override
	Customer clone(String name, String company) {
		return new LoVolCustomer(name, company);
	}

}
