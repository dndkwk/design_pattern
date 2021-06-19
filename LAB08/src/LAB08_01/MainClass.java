//2015112232백근주
package LAB08_01;


public class MainClass {
	public static void main(String[] args) {
		// true/false에 따라 결과가 달라진다.
		UserProxyHandler UserManagerService= new UserProxyHandler(false);
		//UserProxyHandler UserManagerService= new UserProxyHandler(true);
        boolean isUserLoggedIn= UserManagerService.isUserLoggedIn();
        User user=new UserProxyHandler(isUserLoggedIn).getUser();
        user.checkOut();

	}

}
