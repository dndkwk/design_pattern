package LAB12_04;

public class NonVegeFood extends Decorator{

	NonVegeFood(Food food) {
		super(food);
	}

	@Override
	public String menu() {
		return super.menu()+" With Roasted Chicken and Chicken Curry ";
	}

	@Override
	public double price() {
		return super.price()+150.0;
	}

}
