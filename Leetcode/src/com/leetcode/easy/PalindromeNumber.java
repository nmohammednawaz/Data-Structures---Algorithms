package com.leetcode.easy;

import java.util.Scanner;

/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */


/*
 * Example 1:

	Input: x = 121
	Output: true
	Explanation: 121 reads as 121 from left to right and from right to left.
	
 */

public class PalindromeNumber {
	
	/**
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome(int x) {
		
		int original = x;
		int reversed = 0;
		
		while(x > 0) {
			int digit = x % 10;
			reversed = reversed * 10 + digit;
			x /= 10;
		}
		
		return original == reversed;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int x = sc.nextInt();
		
		System.out.println(isPalindrome(x) ? "True" : "False");
		
		sc.close();

	}

}
