/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 3
 * Q5: Write a program that reads three strings from the keyboard. Although the
 *     strings are in no particular order, display the string that would be 
 *     second if they were arranged lexicographically.
 *
 */

import java.util.Scanner;

public class ThreeStrings {

    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner (System.in);
    	
    	//stores the three strings into str1-3
    	System.out.println("Enter your first string");
    	String str1 = keyboard.nextLine();
    	
    	System.out.println("Enter your second string");
    	String str2 = keyboard.nextLine();
    	
    	System.out.println("Enter your third string");
    	String str3 = keyboard.nextLine();
    	
    	// for all cases, compare the lexicographic numbers when adding up all the phrases
    	// and then compare these numerical values to the other two values and output the second
    	// largest value, order it is inputted does not matter
    	if ((str1.compareToIgnoreCase(str2) > 0) && (str1.compareToIgnoreCase(str3) < 0)) {
    		System.out.println(str1);
    	} else if((str1.compareToIgnoreCase(str3) > 0) && (str1.compareToIgnoreCase(str3) < 0)) {
    		System.out.println(str1);
    	} else if((str2.compareToIgnoreCase(str1) > 0) && (str2.compareToIgnoreCase(str3) < 0)) {
    		System.out.println(str2);
    	} else if((str2.compareToIgnoreCase(str3) > 0) && (str2.compareToIgnoreCase(str1) < 0)) {
    		System.out.println(str2);
    	} else if((str3.compareToIgnoreCase(str1) > 0) && (str3.compareToIgnoreCase(str2) < 0)) {
    		System.out.println(str3);
    	} else if((str3.compareToIgnoreCase(str2) > 0) && (str3.compareToIgnoreCase(str1) < 0)) {
    		System.out.println(str3);
    	}
    }
}
