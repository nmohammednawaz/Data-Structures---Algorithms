package com.talentpace.round1;

import java.util.Scanner;

// Replace the vowels with the next character of the given string

public class ReplaceVowels {
	
	/**
	 * 
	 * @param c
	 * @return
	 */
	private static boolean isVowel(char c) {
		if( c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	private static String getReplacedString(String str) {
		
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < str.length() - 1; i++) {
			if(isVowel(str.charAt(i))) {
				s.append(str.charAt(i+1) != ' ' ? str.charAt(i+1) : str.charAt(i+2));
			}else {
				s.append(str.charAt(i));
			}
		}
		
		return s.toString();
		
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the string: ");
		String str = sc.nextLine();
		
		String result = getReplacedString(str);
		System.out.println(result);

		sc.close();
	}

}
