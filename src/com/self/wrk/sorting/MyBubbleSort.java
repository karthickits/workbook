package com.self.wrk.sorting;

public class MyBubbleSort<T> implements MySort<T> {

	@Override
	public T[] sort(T[] arr) {

		int n = arr.length;
		int swapCount = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				if ((Integer) arr[j] > (Integer) arr[j + 1]) {
					T temp = null;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapCount++;
				}
			}
		}
		System.out.println("swap count " + swapCount);
		return arr;
	}
}
