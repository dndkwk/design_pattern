package LAB08_01;

public class UserProxyHandler implements UserProxy {
	boolean isLoggedIn;
	
	public UserProxyHandler(boolean isLoggedIn) {
		this.isLoggedIn=isLoggedIn;
		
	}
	
	boolean isUserLoggedIn() {
		return isLoggedIn;
	}
	
	@Override
	public User getUser() {
		User user;
		if(isLoggedIn){
			user= new AuthorizedUser();
			
		}else {
			user= new GuestUser();
		}
		return user;
	}
}
