package com.java8;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String x = "abcd";
		String y = "abcdxyz";
		int len = findLongestCommonStrLen(x, y);
		System.out.println("Length of longest common substring = " + len);

	}

	private static int findLongestCommonStrLen(String x, String y) {
		int xLength = x.length();
		int yLength = y.length();
		int[][] arr = new int[xLength + 1][yLength + 1];

		int row = 1, col = 1;
		for (char ch : y.toCharArray()) {
			col = 1;
			for (char c : x.toCharArray()) {
				if (ch == c) {
					arr[row][col] = arr[row - 1][col - 1] + 1;
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
