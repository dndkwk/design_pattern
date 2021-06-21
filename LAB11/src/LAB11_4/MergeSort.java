package LAB11_4;

import java.util.ArrayList;

public class MergeSort extends SortStrategy {
	public void sort(ArrayList<String> array) {
		System.out.println("Merge Sort");
		printArray(mergesort(array));
	}

	public static ArrayList<String> mergesort(ArrayList<String> m) {
		if (m.size() <= 1)
			return m; // 종료조건

		// 반복조건
		ArrayList<String> left = new ArrayList<>();
		ArrayList<String> right = new ArrayList<>();
		int mid = m.size() / 2; // 중간인덱스 찾기

		for (int i = 0; i < mid; i++) {
			left.add(m.get(i));
		}

		for (int i = mid; i < m.size(); i++) {
			right.add(m.get(i));
		}


		left = mergesort(left);
		right = mergesort(right);

		return merge(left, right);
	}

	public static ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
		ArrayList<String> rst = new ArrayList<String>(left.size() + right.size()); // 두개를 합친 큰 리스트
		int l = 0, r = 0;

		while (l < left.size() && r < right.size()) { // 둘다 원소가 있는 경우
			if (left.get(l).compareTo(right.get(r))<0) {
				rst.add(left.get(l++));
			} else {
				rst.add(right.get(r++));
			}
		}

		while (l < left.size()) { // 왼쪽만 남아있는 경우
			rst.add(left.get(l++));
		}

		while (r < right.size()) { // 오른쪽만 남아있는 경우
			rst.add(right.get(r++));
		}

		return rst;
	}

	public void printArray(ArrayList<String> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println("");

	}

}
