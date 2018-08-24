/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 1
 * Q4: Write a program that finds the sum and average of four integers
 * 
 */

import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {
    	
    	int r; 
    	int s;
    	int t;
    	int u;
    	    	
        Scanner keyboard = new Scanner (System.in);
        
        //user inputs 4 integers
        
        System.out.println("Enter your first integer");
        r = keyboard.nextInt();
        
        System.out.println("Enter your second integer");
        s = keyboard.nextInt();
        
        System.out.println("Enter your third integer");
        t = keyboard.nextInt();
        
        System.out.println("Enter your fourth integer");
        u = keyboard.nextInt();
        
        int sum = r + s + t + u;
        int average = (sum / 4);
        
        //output is the sum and average of the integers
        
        System.out.println("The sum of your integers is " + sum + " and the average of those integers is " + average);
	}
	
}
