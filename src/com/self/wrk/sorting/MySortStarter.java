package com.self.wrk.sorting;

public class MySortStarter {

	static void display(Integer[] arr) {
		for (int a : arr) {
			System.out.print(a + ",");
		}
	}

	public static void main(String arg[]) {

		Integer[] arr = new Integer[] { 7, 5, 4, 9, 20 };
		// Bubble sort
		MySort<Integer> sort = new MyBubbleSort<>();
		// display(sort.sort(arr));

		// selection sort
		MySort<Integer> selectionSort = new MySelectionSort<>();
		display(selectionSort.sort(arr));

	}
}
