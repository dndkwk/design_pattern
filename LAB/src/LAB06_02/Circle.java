//2015112232백근주
//Shape인터페이스의 함수를 구현한다.
package LAB06_02;

public class Circle implements Shape {
	
	Circle(){
	}
	
	@Override
	public void  draw(String s) {
		System.out.println("Drawing Circle with color "+s);
	}
}
