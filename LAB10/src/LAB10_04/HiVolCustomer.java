//2015112232백근주
package LAB10_04;

public class HiVolCustomer extends Customer {
	String type = "high";
	String name;
	String company;

	HiVolCustomer(String name, String company) {
		this.name = name;
		this.company = company;
	}

	@Override
	Customer clone(String name, String company) {
		return new HiVolCustomer(name, company);
	}

}
