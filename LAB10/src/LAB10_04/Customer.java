//2015112232백근주
package LAB10_04;

abstract class Customer implements Cloneable{
	public String type;
	public String name;
	public String company;

	abstract Customer clone(String name, String company);
}
