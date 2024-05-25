package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	
	private static int romanToInt(String str) {
		
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		
		int total = 0;
		int prev = 0;
		
		for(int i = str.length() - 1; i >= 0; i--) {
			
			char currChar = str.charAt(i);
			int currValue = romanMap.get(currChar);
			
			if(currValue < prev) {
				total -= currValue;
			}else {
				total += currValue;
			}
			
			prev = currValue;
			
		}
		
		return total;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the Roman number: ");
		String str = sc.next();
		
		int number = romanToInt(str.toUpperCase());
		System.out.println(number);
		
		sc.close();

	}

}
