package com.java8;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String x = "bqdrcvefgh";
		String y = "abcvdefgh";
		int len = findLongestCommonSunseqLen(x, y);
		System.out.println("Length of longest common subsequence = " + len);

	}

	private static int findLongestCommonSunseqLen(String x, String y) {
		int xLength = x.length();
		int yLength = y.length();
		int[][] arr = new int[xLength + 1][yLength + 1];

		int row = 1, col = 1;
		for (char ch : x.toCharArray()) {
			col = 1;
			for (char c : y.toCharArray()) {
				if (ch == c) {
					arr[row][col] = arr[row - 1][col - 1] + 1;
				} else {
					arr[row][col] = Math.max(arr[row - 1][col], arr[row][col - 1]);
				}
				col++;
			}
			row++;
		}

		return getMaxLenFromArr(arr, xLength, yLength);
	}

	private static int getMaxLenFromArr(int[][] arr, int x, int y) {
		int max = 0;
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

}
