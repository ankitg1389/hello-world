package com.java8;

public class Permutation {

	public static void main(String[] args) {
		printPermute("abc", "");
	}

	private static void printPermute(String input, String result) {
		if (input.length() == 0) {
			System.out.println(result + " ");
			return;
		}
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String remain = input.substring(0, i) + input.substring(i + 1);
			printPermute(remain, result + ch);
		}
	}

}
