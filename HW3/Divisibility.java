/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 3
 * Q2: Write a program that tests whether one number is 
 *     divisible by another number. Read both numbers from the keyboard.
 *
 */

import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {
        
    	Scanner keyboard = new Scanner (System.in);
    	
    	// user enters two integers
    	System.out.print("Enter two integers: ");
    	int num1 = keyboard.nextInt();
    	int num2 = keyboard.nextInt();
    	
    	// checks if divisible or not, also notes the placement of the two integers
    	if ((num1 % num2) == 0) { 
    		System.out.println(num1 + " is divisible by " + num2); 
    	} else { 
    		System.out.println(num1 + " is not divisible by " + num2);	
    	} if ((num2 % num1) == 0) {
    		System.out.println(num2 + " is divisible by " + num1);   
    	} else {  
    			System.out.println(num2 + " is not divisible by " + num1);
      	}
    }
}
	
