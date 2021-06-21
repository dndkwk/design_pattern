package LAB11_4;

import java.util.ArrayList;

public class SortedList {
	ArrayList<String> array=new ArrayList<String>();
	SortStrategy sortStrategy;

	public void add(String name) {
		array.add(name);
	}

	public void sort() {
		sortStrategy.sort(array);
	}

	public void setSortStrategy(SortStrategy s) {
		this.sortStrategy = s;
	}
}
