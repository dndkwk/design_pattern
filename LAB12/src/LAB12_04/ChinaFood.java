package LAB12_04;

public class ChinaFood extends Decorator{

	ChinaFood(Food food) {
		super(food);
	}

	public String menu() {
		return super.menu()+" With Fried Rice and Manchurian";
	}

	@Override
	public double price() {
		return super.price()+65.0;
	}

}
