package com.leetcode.easy;

import java.util.Scanner;

public class RemoveElement {
	
	/**
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
	public static int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the length of the array: ");
		int n = sc.nextInt();
		
		System.out.print("Please enter the number to remove: ");
		int val = sc.nextInt();
		
		int[] nums = new int[n];
		
		System.out.println("Please enter the numbers of the array:");
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int ans = removeElement(nums, val);

		System.out.println("Total elements removed = " + ans);
		
		sc.close();
	}

}
