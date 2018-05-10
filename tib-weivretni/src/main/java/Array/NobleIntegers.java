package Array;

import java.util.ArrayList;

public class NobleIntegers {
	public static ArrayList<Integer> findNobleInteger(int[] arr) {
		ArrayList<Integer> nobleIntegersList = new ArrayList<>();
		int arrSize = arr.length;
		for (int i = 0; i < arrSize; i++) {
			int count = 0;
			int num = arr[i];
			for (int j = 0; j < arrSize; j++) {
				if (num > 0 && i != j && arr[j] > num) {
					count++;
				}
			}
			if (count == num) {
				nobleIntegersList.add(num);
			}
		}
		return nobleIntegersList;
	}

	public static void main(String[] args) {
		System.out.println(findNobleInteger(new int[] { 7, 3, 16, 10 }));
		System.out.println(findNobleInteger(new int[] { -1, -9, -2, -78, 0 }));
	}
}