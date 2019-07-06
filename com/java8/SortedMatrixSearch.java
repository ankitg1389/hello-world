package com.java8;

public class SortedMatrixSearch {

	public static void main(String[] args) {
		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int elem = 7;
		boolean found = searchInSortedMatrix(input, elem, 3, 3);
		System.out.println("Element found: " + found);
	}

	private static boolean searchInSortedMatrix(int[][] input, int elem, int row, int col) {
		int i = 0, j = col - 1;
		while (i < row && j >= 0) {
			if (elem == input[i][j]) {
				return true;
			} else if (elem < input[i][j]) {
				j--;
			} else if (elem > input[i][j]) {
				i++;
			}
		}
		return false;
	}
}
