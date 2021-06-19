//2015112232백근주
package LAB10_03;

public class MessageBox implements Product {
	String cpy;

	MessageBox(String s) {
		this.cpy = s;

	}

	@Override
	public String use(String s) {
		return cpy + s + cpy;
	}

	@Override
	public Product createClone() {
		Product product = null;
		try {
			product = (Product) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return product;
	}
}
