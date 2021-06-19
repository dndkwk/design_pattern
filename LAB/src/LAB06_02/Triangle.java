
//Shape인터페이스의 함수를 구현한다. 
package LAB06_02;

public class Triangle implements Shape {
	Triangle(){
		
		
	}
	
	@Override
	public void  draw(String s) {
		System.out.println("Drawing Triangle with color "+s);
	}
}
