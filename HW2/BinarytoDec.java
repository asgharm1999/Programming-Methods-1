/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 2
 * Q3: Write a program that reads a 4-bit binary number from the keyboard 
 *     as a string and then converts it into decimal
 * 
 */

import java.util.Scanner;

public class BinarytoDec {

    public static void main(String[] args) {
        
    	int b1, b2, b3, b4;
    	
    	Scanner keyboard = new Scanner (System.in);
    	
    	// the four digit integer user inputs will be stored in str
    	System.out.println("Enter a four digit binary integer");
    	String str = keyboard.nextLine();
    	
    	// store the position of the four digits
    	char cb1 = str.charAt(0);
    	char cb2 = str.charAt(1);
    	char cb3 = str.charAt(2);
    	char cb4 = str.charAt(3);
    	
    	// convert each cb to a number
    	b1 =  Character.getNumericValue(cb1);
    	b2 =  Character.getNumericValue(cb2);
    	b3 =  Character.getNumericValue(cb3);
    	b4 =  Character.getNumericValue(cb4);
    	
    	// multiply these values by the appropriate binary place
    	b1 = b1 * 8;
    	b2 = b2 * 4;
    	b3 = b3 * 2;
    	b4 = b4 * 1;
    	
    	int total = b1 + b2 + b3 + b4;
    	
    	System.out.println(total);
    	
	}
	
}
