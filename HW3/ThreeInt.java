/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 3
 * Q1: Write a program to read in three nonnegative 
 * 	   integers from the keyboard. Display the integers in increasing order. 
 * 
 */

import java.util.Scanner;

public class ThreeInt {

    public static void main(String[] args) {
        
    	Scanner keyboard = new Scanner (System.in);
    	
    	// user enters three nonnegative integers
    	System.out.print("Enter three non repeating integers: ");
    	int num1 = keyboard.nextInt();
    	int num2 = keyboard.nextInt();
    	int num3 = keyboard.nextInt();
    	 
    	// compares all the values of the integer with each other
    	if ((num1 < num2) && (num2 < num3) && (num1 < num3)) {
    	System.out.println("In increasing order, your integers are: " + num1 + ", "
    			+ num2 + ", " + num3);
    	} else if ((num1 < num2) && (num2 > num3) && (num1 < num3)) {
        System.out.println("In increasing order, your integers are: " + num1 + ", "
        		+ num3 + ", " + num2);
        } else if ((num1 > num2) && (num2 < num3) && (num1 < num3)) {
        System.out.println("In increasing order, your integers are: " + num2 + ", "
        		+ num1 + ", " + num3);
    	} else if ((num1 < num2) && (num2 > num3) && (num1 > num3)) {
        System.out.println("In increasing order, your integers are: " + num3 + ", "
        		+ num1 + ", " + num2);
    	} else if ((num1 > num2) && (num2 < num3) && (num1 > num3)) {
        System.out.println("In increasing order, your integers are: " + num2 + ", "
        		+ num3 + ", " + num1);
    	} else if ((num1 > num2) && (num2 > num3) && (num1 > num3)) {
        System.out.println("In increasing order, your integers are: " + num3 + ", "
        		+ num2 + ", " + num1);
    	}
    }
}
