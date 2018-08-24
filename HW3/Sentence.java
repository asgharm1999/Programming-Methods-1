/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 3
 * Q3: Write a program that reads a one-line sentence as 
 *     input and then displays the following responses.
 * 
 */

import java.util.Scanner;

public class Sentence {

    public static void main(String[] args) {
    	
    	System.out.println("Enter a one-line sentence, feel free to use punctuation.");
    	Scanner keyboard = new Scanner (System.in);
    	String sent = keyboard.nextLine();
    	
    	// finds the last character in the sentence
    	int length = sent.length();
    	char last = sent.charAt(length - 1);
    	
    	// separated the amount of even or odd characters, and if it ends with "?"
    	// or "!" into different outputs
    	if ((last == '?') && (length % 2 == 0)) {
    		System.out.println("Yes");
    	} else if ((last == '?') && (length % 2 != 0)) {
        	System.out.println("No");
    	} else if (last == '!') {
    		System.out.println("Wow");
    	} else {
    		System.out.println("You always say " + "\"" + sent + "\"");
    	}  
    }
}
