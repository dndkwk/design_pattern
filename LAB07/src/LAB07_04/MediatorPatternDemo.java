//2015112232백근주
//User 변수를 만들고 ChatRoom으로 메세지를 보내도록 한다.
package LAB07_04;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		User us1=new User("Park Seri");
		User us2=new User("Gildong");
		
		us1.sendMessage("Hi ! Park Seri!");
		us2.sendMessage("Hello! Gildong!");
		
		
	}
}
