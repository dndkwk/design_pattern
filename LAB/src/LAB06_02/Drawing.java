
//Shape인터페이스의 함수를 구현하고 Child 객체를 다룰 수 있는 함수를 구현한다.
//List를 사용하여 Shape 객체들을 저장한다.
//draw함수 다른 클래스의 draw와 다르게 List에 저장된 객체들의 draw 함수를 호출한다.
package LAB06_02;

import java.util.List;
import java.util.ArrayList;

public class Drawing implements Shape{
	
	List<Shape> sh=new ArrayList<Shape>();
	
	Drawing() {
		
	}
	
	@Override
	public void draw(String s) {
		for(int i=0;i<sh.size();i++) {
			sh.get(i).draw(s);
		}
	}	

	public void add(Shape sh) {
		this.sh.add(sh);
	}

	public void remove(Shape sh) {
		this.sh.remove(sh);
	}

	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.sh.clear();
	}

}
