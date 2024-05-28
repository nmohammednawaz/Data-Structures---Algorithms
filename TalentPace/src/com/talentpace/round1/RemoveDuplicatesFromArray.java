package com.talentpace.round1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// Print the unique elements of the given array after removing the duplicates

public class RemoveDuplicatesFromArray {

	/**
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	private static int[] removeDuplicates(int[] arr, int n) {
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int a : arr) {
			map.put(a, 1);
		}
		
		int[] result = new int[map.size()];
		
		int index = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			result[index++] = entry.getKey();  // Also can directly print if don't want to return anything from function
		}
		
		
		return result;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter length of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Please enter the array elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] result = removeDuplicates(arr, n);
		
		for(int a : result) {
			System.out.print(a + " ");
		}
		
		sc.close();
	}

}
