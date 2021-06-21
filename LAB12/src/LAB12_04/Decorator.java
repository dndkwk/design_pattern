package LAB12_04;

public class Decorator implements Food{
	protected Food food;
	
	Decorator(Food food){
		this.food=food;
	}
	
	@Override
	public String menu() {
		return food.menu();
	}

	@Override
	public double price() {
		return food.price();
	}

}
