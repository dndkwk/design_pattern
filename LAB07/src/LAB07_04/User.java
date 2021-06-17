//2015112232백근주
//생성할때 이름을 받는다. ChatRoom으로 메세지를 보낼때 이름과 같이 보낸다.
package LAB07_04;

public class User {
	private String name;

	public User(String name) {
		this.setName(name);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void sendMessage(String msg) {
		ChatRoom.showMessage(this.getName(),msg);
	}

}
