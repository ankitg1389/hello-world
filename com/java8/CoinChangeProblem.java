package com.java8;

public class CoinChangeProblem {

	public static void main(String[] args) {
		System.out.println(coinChange(12, new int[] { 1, 2, 5 }));
	}

	private static int coinChange(int amount, int[] coins) {
		int[] combinations = new int[amount + 1];
		combinations[0] = 1;
		for (int coin : coins) {
			for (int i = 1; i < combinations.length; i++) {
				if (i >= coin) {
					combinations[i] += combinations[i - coin];
				}
			}
		}
		return combinations[amount];
	}

}
