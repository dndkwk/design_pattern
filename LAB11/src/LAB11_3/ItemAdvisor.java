package LAB11_3;

public class ItemAdvisor implements Advisor{
	public static final ItemAdvisor itemadvisor=new ItemAdvisor();
	private ItemAdvisor() {
		
	}
	
	public Firework recommend(Customer c) {
		return (Firework) LikeMyStuff.suggest(c);
	}
}
