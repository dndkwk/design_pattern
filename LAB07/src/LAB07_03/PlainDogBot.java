
//DogBot인터페이스를 받고 구현하는 클래스
//생성할때 hungry,tired,name을 저장하고 getName()으로 name을 반환하게 만든다.
package LAB07_03;

public class PlainDogBot implements DogBot{
	protected String name;
	protected int hungry, tired;

	public PlainDogBot(int h, int t,String s) {
		hungry = h;
		tired = t;
		name=s;
	}

	public boolean eat() {
		if (hungry > 6) {
			hungry -= 3;
			return true;
		} else
			return false;
	}

	public void rest() {
		hungry++;
		tired -= 2;
	}

	public void play() {
		hungry += 2;
		tired += 3;
	}

	public String noise() {
		if (hungry > 8 && tired < 11)
			return "whine ";
		else if (tired > 7 && tired > hungry)
			return "snore ";
		else
			return "woof ";
	}
	
	public String getName() {
		return name;
	}
}
