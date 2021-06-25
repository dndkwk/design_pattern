package namecard;

//Basics 3
public class Name {
	private String firstName;
	private String middleName;
	private String lastName;
	private String Inits;//이니셜 변수

	public Name(String fName, String mName, String lName) {
		firstName = fName;
		middleName = mName;
		lastName = lName;
		//이니셜 만들기
		Inits=fName.substring(0,1)+mName.substring(0,1)+lName.substring(0,1);
	}
	
	public Name(String fName, String lName) {
		firstName = fName;
		middleName = "";
		lastName = lName;
		//이니셜 만들기
		Inits=fName.substring(0,1)+lName.substring(0,1);
	}


	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String fn) {
		firstName = fn;
	}

	public void setMiddleName(String mn) {
		middleName = mn;
	}

	public void setLastName(String ln) {
		lastName = ln;
	}

	public String getFirstAndLastName() {
		return firstName + " " + lastName;
	}
	
	public String getFirstAndMidInitAndLastName() {
		//first 네임+미들이니셜+last 네임 get하기
		return firstName +" "+middleName.substring(0,1)+" "+ lastName;
	}

	public String getLastCommaFirst() {
		return lastName + ", " + firstName;
	}
	
	public String getInits() {
		//이니셜 get
		return Inits;
	}
	

}
