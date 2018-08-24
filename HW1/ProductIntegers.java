/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 1
 * Q3: Write a program that calculates and prints the product of three numbers
 * 
 */

import java.util.Scanner;

public class ProductIntegers {

    public static void main(String[] args) {
    	
    	int x; 
    	int y;
    	int z;
    	
        Scanner keyboard = new Scanner (System.in);
        
        //user inputs three integers
        
        System.out.println("Enter your first integer");
        x = keyboard.nextInt();
        
        System.out.println("Enter your second integer");
        y = keyboard.nextInt();
        
        System.out.println("Enter your third integer");
        z = keyboard.nextInt();
        
        int product = x * y * z;
        
        //outputs the product of these three integers
        
        System.out.println("The product of those three integers is " + product);
	}
	
}
