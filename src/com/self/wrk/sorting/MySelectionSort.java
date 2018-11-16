package com.self.wrk.sorting;

public class MySelectionSort<T> implements MySort<T> {

	@Override
	public T[] sort(T[] elements) {

		Integer[] arr = (Integer[]) elements;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {

			int minimum = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minimum]) {
					minimum = j;
				}
			}

			int temp = 0;
			temp = arr[minimum];
			arr[minimum] = arr[i];
			arr[i] = temp;
		}

		return (T[]) arr;
	}

}
