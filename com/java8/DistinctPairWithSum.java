package com.java8;

import java.util.Arrays;
import java.util.List;

public class DistinctPairWithSum {

	private static final int SIZE = 1000;

	public static void main(String[] args) {
		int[] arr = { 7, 6, 6, 3, 9, 3, 5, 1 };
		int sum = 12;
		findPairs(arr, sum);
		List<Integer> list = Arrays.asList(7, 6, 6, 3, 9, 3, 5, 1);
		System.out.println("Distinct pair = " + numberOfPairs(list, sum));
	}

	private static void findPairs(int[] arr, int sum) {
		int c = 0;
		boolean[] count = new boolean[SIZE];
		for (int i = 0; i < arr.length; i++) {
			int tmp = sum - arr[i];
			if (tmp >= 0 && count[tmp]) { // if already set
				// System.out.println(arr[i] + ", " + tmp);
				if (!count[arr[i]]) {
					c++;
				}
			}
			if (!count[arr[i]]) {
				count[arr[i]] = true; // if not set, make it true
			}
		}
		System.out.println("Total no of Distinct pair = " + c);
	}

	public static int numberOfPairs(List<Integer> a, long k) {
        int c = 0;
        boolean[] count = new boolean[100000000];
        for (Integer n : a) {
            long tmp = (int) (k - n);
            if (tmp >= 0 && count[(int) tmp]) {
                if (!count[n]) {
                    c++;
                }
            }
            if (!count[n]) {
                count[n] = true;
            }
        }
        return c;
    }
}