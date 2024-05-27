package com.leetcode.easy;

import java.util.Scanner;

/*

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

*/

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
