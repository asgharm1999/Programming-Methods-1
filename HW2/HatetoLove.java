/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 2
 * Q4: Write a program that reads a line of text and then displays the line, 
 *     but with the first occurrence of hate changed to love
 * 
 */

import java.util.Scanner;

public class HatetoLove {

    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner (System.in);
    	
    	// store and keep track the word "love" when it used in the sentence
    	System.out.println("Enter a line of text with the word "
    			+ "\"love,\" for instance \"I love you.\"");
        String love = keyboard.nextLine();
        int loveIndex = love.indexOf("love");
        
        // copy the line of text up to the word love, then add in hate,
        // and finally add in the rest of the sentence
        System.out.println("I have rephrased that line to read: ");
        System.out.println(love.substring(0, loveIndex) 
        		+ "hate" + love.substring(loveIndex + 4));
    }
}