package com.leetcode.easy;

import java.util.Scanner;


/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */


//  Sample Input and Output

/*
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class TwoSum {
	
	/**
	 * 
	 * @param nums
	 * @param target
	 * @return 
	 */
	public static int[] twoSum(int[] nums, int target) {

		int[] ans = new int[2];
		for(int i = 0; i < nums.length - 1; i++){
			for(int j = i + 1; j < nums.length; j++){
				if((nums[i] + nums[j]) == target){
					ans[0] = i;
					ans[1] = j;
					break;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int target = sc.nextInt();

		int nums[] = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		int ans[] = twoSum(nums, target);
		System.out.println("[" + ans[0] + ", " + ans[1] + "]");

		sc.close();
	}

}
