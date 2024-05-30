package com.talentpace.round2;

import java.util.Scanner;

// We Live in Bangalore
// we eive en nangalores

// Replace the first characte of the word with the previous word's last character

public class ReplaceLastCharacter {
	
	private static String getReplacedString(String str) {
		StringBuilder s = new StringBuilder();
		
		String[] arr = str.split(" ");
		s.append(arr[0]).append(" ");
		for(int i = 1; i < arr.length; i++) {
			String prevWord = arr[i-1];
			String currWord = arr[i];
			
			String newWord = currWord.replace(currWord.charAt(0), prevWord.charAt(prevWord.length() - 1));
			s.append(newWord).append(" ");
		}
		
		
		
		return s.toString();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the string: ");
		String str = sc.nextLine();
		
		String result = getReplacedString(str);
		System.out.println(result);
		
		sc.close();

	}

}
