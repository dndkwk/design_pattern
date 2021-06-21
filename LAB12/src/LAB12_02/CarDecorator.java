package LAB12_02;

public class CarDecorator implements Car{
	
	public Car car;
	
	CarDecorator(Car car){
		this.car=car;
	}
	
	@Override
	public void assemble() {
		this.car.assemble();
	}
	

}
