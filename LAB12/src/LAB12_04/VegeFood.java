package LAB12_04;

public class VegeFood implements Food{

	@Override
	public String menu() {
		return "Veg Food";
	}

	@Override
	public double price() {
		return 50.0;
	}

}
