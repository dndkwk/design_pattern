//2015112232백근주
//추상 클래스이다.
//공통 부분으로 Color를 생성자로 받고 applyColor()함수를 가지고 있다.
package LAB06_4;

public abstract class Shape {
	Color color;
	Shape(Color c){
		this.color=c;
	}
	abstract public void applyColor();
}
