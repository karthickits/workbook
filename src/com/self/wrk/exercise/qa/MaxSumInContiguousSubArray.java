package com.self.wrk.exercise.qa;

//Implementation based on the kadane's algorithm

// Initialize: max_so_far = 0 max_ending_here = 0
// Loop for each element of the array
// (a) max_ending_here = max_ending_here + a[i]
// (b) if(max_ending_here < 0)
// max_ending_here = 0
// (c) if(max_so_far < max_ending_here)
// max_so_far = max_ending_here
// return max_so_far

//Eg: {-2, -3, 4, -1, -2, 1, 5, -3}

public class MaxSumInContiguousSubArray {

	static void sumWithElemIndex() {

	}

	public static void main(String[] arg) {
		int[] array = new int[] { 2, 3, 4, 1, -20, 1, 5, 3 };

		int max_ending_here = 0, max_so_far = 0;
		for (int i = 0; i < array.length; i++) {

			max_ending_here = max_ending_here + array[i];
			if (max_ending_here < 0)
				max_ending_here = 0;
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
	}
}
