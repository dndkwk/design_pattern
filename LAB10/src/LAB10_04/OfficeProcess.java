//2015112232백근주
package LAB10_04;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class OfficeProcess {
	Scanner sc;
	String company_name;
	String type = "medium";
	List<Customer> customerList;
	private HashMap<String, Customer> proto = new HashMap<String, Customer>();

	OfficeProcess() {
		this.sc = new Scanner(System.in);
	}

	public void register(String type, Customer customer) {
		proto.put(type, customer);
	}

	public Customer create(String type, String name) {
		return ((Customer) proto.get(type)).clone(name, company_name);
	}

	public void company_name() {
		System.out.println("Enter Company Name");
		String temp = sc.nextLine();
		this.company_name = temp;
		System.out.println("Now the application would collect lots more company information ....");
	}

	public void customer_type() {
		System.out.println(
				"Please pick a type of customer from one of the following:('medium' will be assumed otherwise)\n");
		System.out.println("low\nmedium\nhigh\n");
		String temp = sc.nextLine();
		this.type = temp;

	}

	public void show() {
		System.out.println("\nClient does some work .....\n");
		System.out.println("Client calls on the application of Prototype pattern .....");
		System.out.println("Enter Customer names or '-quit'");
		String temp;// 이름

		do {
			temp = sc.nextLine();
			if (temp.equals("-quit")) {
				System.out.println("The customers entered during this session:\n");
				for (int i = 0; i < customerList.size(); i++) {
					System.out.println("Custommer " + customerList.get(i).name);
					System.out.println("an employee of " + customerList.get(i).company + ".. ");
					System.out.println("Spending category" + customerList.get(i).type + " volume. ");
					System.out.println("Lots more ....\n");
				}
				System.out.println("\nClient does some work .....\n");
				break;
			} else {
				System.out
						.println("... more interaction to get information about " + temp + "... : Stored in database");
				customerList.add(create(type, temp));
			}
		} while (true);
	}

}
