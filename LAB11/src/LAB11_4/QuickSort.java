package LAB11_4;

import java.util.ArrayList;

public class QuickSort extends SortStrategy {
	public void sort(ArrayList<String> array) {
		System.out.println("Quick Sort");
		printArray(quickSort(array));
	}

	public ArrayList<String> quickSort(ArrayList<String> numbers) {
		if (numbers.size() < 2)
			return numbers;

		final String pivot = numbers.get(0);
		final ArrayList<String> lower = new ArrayList<>();
		final ArrayList<String> higher = new ArrayList<>();

		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i).compareTo(pivot)<0) {
				lower.add(numbers.get(i));
			} else {
				higher.add(numbers.get(i));
			}
		}

		final ArrayList<String> sorted = quickSort(lower);
		sorted.add(pivot);
		sorted.addAll(quickSort(higher));

		return sorted;
	}

	public void printArray(ArrayList<String> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println("");

	}

}
