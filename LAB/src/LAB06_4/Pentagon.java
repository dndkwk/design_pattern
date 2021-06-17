//2015112232백근주
//Shape을 상속받아 부모 클래스에게 Color변수를 보낸다.
//applyColor()은 각 클래스에 맞게 출력하고 color의 applyColor()를 또 호출한다.
package LAB06_4;

public class Pentagon extends Shape {
	public Pentagon(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	}

}
