/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 4
 * Q3: Write a program that takes the first letter of a word and places it in the back.
 * 	   Doing so will result in the same word. 
 *     
 */

import java.util.Scanner;

public class BackFoward {

    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner(System.in);
    	
    	// inputs the word
    	System.out.println("Enter a word where if we take the first letter of it, and move it ");
    	System.out.println("to the back, we get the same word in reverse. Examples: banana, ");
    	System.out.println("dresser, grammar, potato, revive, uneven, assess.");
    	String input = keyboard.nextLine();
    	input = input.toLowerCase();
    	
    	// checks to see if the word "quit" has been input, if not it stores the first letter
    	// of the word and puts it to the back
    	while (!input.equals("quit")) { 
    	    boolean hasProperty = true; 
    	    
    	    for (int i = 1; i < input.length(); i++) {  
    	        char frontChar = input.charAt(i); 
    	        char backChar = input.charAt(input.length() - i);
    	        
    	        if (frontChar != backChar)
    	            hasProperty = false;
    	    }
    	    
    	    // outputs the quality of the word, if it can be written as such or not
    	    if(!hasProperty) {
    	        System.out.println(input + " does not have the quality");
    	    } else {
    	        System.out.println(input + " has the quality");
    	    }
    	    
    	    // starts over and checks another word
    	    input = keyboard.nextLine();
    	
    	}
    }
}