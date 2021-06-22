package LAB13_04;

public abstract class Party {

	public void printNameAndDetails() {
		printName();
		printDetail();
	}

	public abstract void printName();

	public abstract void printDetail();

}
