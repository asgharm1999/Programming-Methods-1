/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 2
 * Q1: Write a program that reads a four-digit integer such, as 1998, displays it, one digit per line
 * 
 */

import java.util.Scanner;

public class FourInt {

    public static void main(String[] args) {
        
    	int FourDigitNum;
    	int d1, d2, d3, d4;
    	
    	Scanner keyboard = new Scanner (System.in);
    	
    	// the four digit integer user inputs will be stored in FourDigitNum
    	System.out.println("Enter a four digit integer");
    	FourDigitNum = keyboard.nextInt();
    	
    	//take these four digits and using mod, dividing by digits place, store them into d1-4
    	d1 = FourDigitNum / 1000;
    	FourDigitNum = FourDigitNum % 1000;
    	d2 = FourDigitNum / 100;
    	FourDigitNum = FourDigitNum % 100;
    	d3 = FourDigitNum / 10;
    	FourDigitNum = FourDigitNum % 10;
    	d4 = FourDigitNum / 1;
    	FourDigitNum = FourDigitNum % 1;
    	
    	// print d1-4 line by line
    	System.out.println(d1);
    	System.out.println(d2);
    	System.out.println(d3);
    	System.out.println(d4);
    		
	}
	
}
