package hello;
//1번
//public class Circle{
//	public double radius;
//}
//
//public class Rectangle{
//	public double length;
//	public double width;
//}
//
//public interface AreaCalculator{
//	public double calculateArea(Object obj);
//	
//}
//
//public class calculateRectangleArea implements AreaCalculator{
//	@Override
//	public double calculateArea(Object rectangle){
//		return rectangle.length *rectangle.width;
//	}
//}
//
//public class calculateCircleArea implements AreaCalculator{
//	@Override
//	public double calculateArea(Object circle){
//		return (22/7)*circle.radius*circle.radius;
//	}
//}

//2번
//class Text {
//	String text;
//	String author;
//	int length;
//	String getText() { ... }
//	void setText(String s) { ... }
//	String getAuthor() { ... }
//	void setAuthor(String s) { ... }
//	int getLength() { ... }
//	void setLength(int k) { ... }
//}
//
//class ChangeText{
//	/*methods that change the text*/
//	void allLettersToUpperCase() { ... }
//	void findSubTextAndDelete(String s) { ... }
//}
//
//class printText{
//	/*method for formatting output*/
//	void printText() { ... }
//}

//3번
//public class LightBulb {
//	public void turnOn() {
//		System.out.println("LightBulb: Bulb turned on...");
//	}
//
//	public void turnOff() {
//		System.out.println("LightBulb: Bulb turned off...");
//	}
//}
//
//public class Fan{
//	public void turnOn() {
//		System.out.println("Fan: Fan turned on...");
//	}
//
//	public void turnOff() {
//		System.out.println("Fan: Fan turned off...");
//	}
//}
//
//public interface ISwitch{
//	public boolean isOn();
//	public void press();
//}
//
//public class ElectricPowerSwitch implements ISwitch{
//	public Object obj;
//	public boolean on;
//	public ElectricPowerSwitch(Object obj) {
//		this.obj = obj;
//		this.on = false;
//	}
//	@Override
//	public boolean isOn() {
//		return this.on;
//	}
//	@Override
//	public void press() {
//		boolean checkOn = isOn();
//		if (checkOn) {
//			obj.turnOff();
//			this.on = false;
//		} else {
//			obj.turnOn();
//			this.on = true;
//		}
//	}
//}

//4번
//public interface MoveToy {
//	void setPrice(double price);
//	void setColor(String color);
//	void move();
//}
//
//public interface FlyToy {
//	void setPrice(double price);
//	void setColor(String color);
//	void fly();
//}
//
//public interface Toy {
//	void setPrice(double price);
//	void setColor(String color);
//}
//
//public class ToyPlane implements FlyToy {
//	double price;
//	String color;
//	@Override
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	@Override
//	public void setColor(String color) {
//		this.color = color;
//	}
//	@Override
//	public void fly() {
//		System.out.println("fly");
//	}
//}
//
//public class ToyCar implements MoveToy {
//	double price;
//	String color;
//	@Override
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	@Override
//	public void setColor(String color) {
//		this.color = color;
//	}
//	@Override
//	public void move() {
//		System.out.println("move");
//	}
//}
//
//public class ToyHouse implements Toy {
//	double price;
//	String color;
//	@Override
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	@Override
//	public void setColor(String color) {
//		this.color = color;
//	}
//}

//10번
//interface Driveable {
//    void accelerate();
//    void steerRight();
//    void steerLeft();
//    void steerStraight();
//    void brake();
//};
//
//class SelfDrivingCar implements Driveable{
//    public void accelerate() {
//        // implementation here
//    	System.out.println("SelfDrivingCar accelerate");
//    }
//    public void steerRight() {
//        // implementation here
//    	System.out.println("SelfDrivingCar steerRight");
//    }
//    public void steerLeft() {
//        // implementation here
//    	System.out.println("SelfDrivingCar steerLeft");
//    }
//    public void steerStraight() {
//        // implementation here
//    	System.out.println("SelfDrivingCar steerStraight");
//    }
//    public void brake() {
//        // implementation here
//    	System.out.println("SelfDrivingCar brake");
//    }
//};
//
//class Car{
//	private Driveable dr;
//	Car(Driveable dr){
//		this.dr=dr;
//	}
//	public void accelerate() {
//		dr.accelerate();
//	}
//	public void steerRight() {
//    	dr.steerRight();
//    }
//	public void steerLeft() {
//    	dr.steerLeft();
//    }
//	public void steerStraight() {
//    	dr.steerStraight();
//    }
//	public void brake() {
//    	dr.brake();
//    }
//}
//




public class Test {
	public static void main(String[] args) {
		Rectangle r = new Square(3);
		System.out.println("Square");
		r.setHeight(5);
		System.out.println("r.setHeight(5);");
		System.out.println("height: "+r.getHeight());
		System.out.println("width: "+r.getWidth());
		r.setWidth(6);
		System.out.println("r.setWidth(6);");
		System.out.println("height: "+r.getHeight());
		System.out.println("width: "+r.getWidth());

		
	}

}
