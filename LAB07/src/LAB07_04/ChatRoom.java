//2015112232백근주
//중재자를 담당한다.
//ChatRoom 객체를 안만들어도 사용할 수 있도록 static 메소드를 구현한다.
package LAB07_04;
import java.util.Date;

public class ChatRoom {
	public static void showMessage(String name,String msg) {
		Date d=new Date();
		System.out.println(d+" ["+name+"] : "+msg);
	}
	
}
