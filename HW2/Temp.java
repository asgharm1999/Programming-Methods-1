/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 2
 * Q2: Write a program that convert temperature from Fahrenheit to Celsius 
 * 
 */

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
    	
    	double F;
    	double C;
    	
    	// user inputs a degree they want converted
    	System.out.println("Enter a degree in Farenheit");
    	Scanner keyboard = new Scanner (System.in);
    	F = keyboard.nextDouble();
    	
    	// value of F is inputed into formula and solved for C
    	C = 5 * (F- 32) / 9; 	
    	
    	// to round to one decimal place
    	C = Math.round(C * 10.0) / 10.0;
    	
    	//print the conversion
    	System.out.print(F + " converted is " + C + " in Celsius");
	}
	
}
