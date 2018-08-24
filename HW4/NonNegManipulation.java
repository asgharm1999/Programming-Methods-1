/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 4
 * Q2: Write a program that find the largest, smallest, and average of nonnegative integers 
 *     
 */

import java.util.Scanner;

public class NonNegManipulation {

    public static void main(String[] args) {
    	
    	// sets default values
    	int count = 0;
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        double average = 0;
        boolean notNull = true;
        
        // user enters numbers
        Scanner keyboard = new Scanner( System.in );
        System.out.println("Enter as many nonnegative numbers as you want, end with a negative number: ");
        
        // compares one number to the next and sorts accordingly
        while (notNull == true) {
            int numbers = keyboard.nextInt();
            
            if (numbers < 0)
                notNull = false;
            else {
                if (numbers > largest)
                    largest = numbers;
                if (numbers <= smallest)
                    smallest = numbers;
                
                sum += numbers;
                count++;
            }
        }

        // finds average
        average = sum/count;

        // print desired results
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The average of the numbers is: " + average);
    }
}