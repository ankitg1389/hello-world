package com.java8;

import java.util.HashSet;

public class PairWithSumInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 5, 7, 9 };
		printPairWithSumInArray(arr);
	}

	private static void printPairWithSumInArray(int[] arr) {
		HashSet<Integer> hs = new HashSet<>();
		for (int n : arr) {
			hs.add(n);
		}
		System.out.println(hs);
		int n = arr.length;
		int sum;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				sum = arr[i] + arr[j];
				if (hs.contains(sum)) {
					//TODO: print distinct pair
					System.out.println(arr[i] + ", " + arr[j]);
				}
			}
		}
	}

}
