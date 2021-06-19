//2015112232백근주
//Rocket 클래스이다. Rocket객체는 name,price,apogee 변수를 가지고 있다.
//객체 생성시 각 변수들을 매개변수로 받고 각 private변수를 함수로 get할 수 있다.
package makeRocket;

public class Rocket {

	private String name;
	private double price;
	private double apogee;

	public Rocket(String name, double price, double apogee) {
		this.name = name;
		this.price = price;
		this.apogee = apogee;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getApogee() {
		return apogee;
	}

}
