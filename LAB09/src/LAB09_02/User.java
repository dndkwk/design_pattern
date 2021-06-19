//2015112232백근주
package LAB09_02;

public class User {
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional

	public User(Builder builder) {
		firstName=builder.firstName;
		lastName=builder.lastName;
		age=builder.age;
		phone=builder.phone;
		address=builder.address;
	}
	
	public static class Builder {
		private final String firstName; // required
		private final String lastName; // required

		private int age = 0; // optional
		private String phone = ""; // optional
		private String address = ""; // optional

		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Builder age(int val) {
			this.age=val;
			return this;
		}

		public Builder phone(String val) {
			this.phone=val;
			return this;
		}

		public Builder address(String val) {
			this.address=val;
			return this;
		}
		
		public User build(){
			return new User(this);
			
		}

	}

}
