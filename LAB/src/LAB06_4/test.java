//2015112232백근주
//Triangle과 Pentagon 객체를 생성 후 매개변수로 Color를 넣고 Shape의 applyColor()를 호출한다. 
package LAB06_4;
public class test {

	public static void main(String[] args) {
		Shape t = new Triangle(new RedColor());
		t.applyColor();
		
		Shape p = new Pentagon(new GreenColor());
		p.applyColor();

	}

}
