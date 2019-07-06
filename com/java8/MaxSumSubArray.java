package com.java8;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int[] input = { 4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2 };
		findMaxSumSubArray(input);
	}

	// Kadane's Algorithm
	private static void findMaxSumSubArray(int[] input) {
		int max = input[0], local_max = 0;
		int start = 0, end = 0, s = 0;
		for (int i = 0; i < input.length; i++) {
			local_max += input[i];
			if (max < local_max) {
				max = local_max;
				start = s;
				end = i;
			}
			if (local_max < 0) {
				local_max = 0;
				s = i + 1;
			}
		}
		for (int j = start; j <= end; j++) {
			System.out.print(input[j] + " ");
		}
	}

}
