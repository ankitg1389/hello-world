package com.java8;

public class PairWithSum {

	private static final int SIZE = 1000;

	public static void main(String[] args) {
		int[] arr = { 1,2,2,3,3,1};
		//int[] arr = { 1,2,3,4,5,6};
		/*int sum = 16;
		findPairs(arr, sum);*/
		int diff = 1;
		findPairs(arr, diff);
	}

	/*private static void findPairs(int[] arr, int sum) {
		int c = 0;
		boolean[] count = new boolean[SIZE];
		for (int i = 0; i < arr.length; i++) {
			int tmp = sum - arr[i];
			if (tmp >= 0 && count[tmp]) { // if already set
				System.out.println(arr[i] + ", " + tmp);
				c++;
			}
			count[arr[i]] = true; // if not set, make it true
		}
		System.out.println("Total no of pair = " + c);
	}*/
	
	private static void findPairs(int[] arr, int diff) {
		int c = 0;
		boolean[] count = new boolean[SIZE];
		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[i]-diff;
			if (tmp >= 0 && count[tmp]) { // if already set
				System.out.println(arr[i] + ", " + tmp);
				if (!count[arr[i]]) {
					c++;
				}	
			}
			if (!count[arr[i]]) {
				count[arr[i]] = true; // if not set, make it true
			}
			
		}
		System.out.println("Total no of pair = " + c);
	}
	
	/*int c = 0;
    boolean[] count = new boolean[256];
    for (int num : numbers) {
        int tmp = num-k;
        if (tmp >= 0 && count[tmp] ) {
           if (!count[num]) {
                c++;
            } 
        }
        if (!count[num]) {
            count[num] = true; // if not set, make it true
        }
    }
   return c;*/

}