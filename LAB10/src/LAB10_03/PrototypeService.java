//2015112232백근주
package LAB10_03;

import java.util.HashMap;

public class PrototypeService {
	private HashMap<String, Product> temp = new HashMap<>();
	public void register(String s, Product proto) {
		temp.put(s, proto);
	}
	
	public Product create(String s) {
	
		return ((Product) temp.get(s)).createClone();
	}
}
