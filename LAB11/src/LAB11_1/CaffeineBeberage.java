package LAB11_1;

abstract class CaffeineBeberage {
	
	abstract void prepareRecipe();
	
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
}
