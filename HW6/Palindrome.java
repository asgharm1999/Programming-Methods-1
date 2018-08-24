/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 6
 * Q2: Determine if a string of characters is a palindrome
 *     
 */

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) { 
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a string of characters."); 
		String str = keyboard.nextLine();
		str = str.toLowerCase();
		str = str.replaceAll("\\s+",""); // removes spaces
		char[] chars = str.toCharArray();
		
		if (isPalindrome(chars, chars.length)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}

	// compares the last char to the first char
	public static boolean isPalindrome(char[] a, int used) {
		for (int i = 0; i < used / 2; i++) {
			if (a[i] != a[used - i - 1])
				return false;
		}
		return true;
	}
}