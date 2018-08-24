/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 3
 * Q4: Write a program that reads a string from the 
 *     keyboard and tests whether it contains a valid date. 
 */

import java.util.Scanner;

public class Dates {

    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner (System.in);
    	
    	// user enters a date
    	System.out.println("Enter a date in the form mm/dd/yyyy");
    	String mydate = keyboard.next();
    	
    	// separate the string into mm, dd, yyyy
    	String mm = mydate.substring(0, 2);
    	String dd = mydate.substring(3, 5);
    	String yyyy = mydate.substring(6);
    	
    	// convert strings into int
    	int mm1 = Integer.parseInt(mm);
    	int dd1 = Integer.parseInt(dd);
    	int yyyy1 = Integer.parseInt(yyyy);
    	
    	// if leap year
    	boolean isLeapYear = ((yyyy1 % 4 == 0) && (yyyy1 % 100 == 0) && (yyyy1 % 400 == 0));
    	
    	// rules for month format 
    	if ((mm1 >= 1) && (mm1 <= 12)) {
    		System.out.println("Month is in correct format");
    	} else if ((mm1 < 0 || mm1 > 12)) {
    		System.out.println("Make sure the month is from 1-12");
    	}
    	
    	// rules for months that have 30 days
    	if ((mm1 == 4 || mm1 == 6 || mm1 == 9 || mm1 == 11) && (dd1 <= 30)) {
    		System.out.println("Date is in correct format");
    	} else if ((mm1 == 4 || mm1 == 6 || mm1 == 9 || mm1 == 11) && (dd1 > 30 || dd1 < 0)) {
    		System.out.println("Date for months 4, 6, 9, 11 only goes up to 30");
    	}
    	
    	// rules for months that have 31 days
    	if ((mm1 == 1 || mm1 == 3 || mm1 == 5 || mm1 == 7 || mm1 == 8 || mm1 == 10 
    			|| mm1 == 12) && (dd1 <= 31)) {
    		System.out.println("Date is in correct format");
    	} else if ((mm1 == 1 || mm1 == 3 || mm1 == 5 || mm1 == 7 || mm1 == 8 || mm1 == 10 
    			|| mm1 == 12) && (dd1 > 31 || dd1 < 0)) {
    		System.out.println("Date for months 1, 3, 5, 7, 8, 10, 12 only goes up to 31");
    	}
    	
    	// rules for February
    	if ((mm1 == 2) && (dd1 <= 28)) {
    		System.out.println("Date is in correct format");
    	} else if ((mm1 == 2) && (dd1 == 29) && (isLeapYear)) {
    		System.out.println("Date is in correct format");
    	} else if ((mm1 == 2) && (dd1 > 28 || dd1 < 0)) {
    		System.out.println("Date for month 2 only goes up to 28 (29 in leap year)");
    	}
    	
    	// rules for year
    	if ((yyyy.length() >= 3) && (yyyy.length() <= 4)) {
    		if ((yyyy1 % 4 == 0) && (yyyy1 % 100 == 0) && (yyyy1 % 400 == 0)) {
        		System.out.println("This is a leap year");
    		} else {
    			System.out.println("Year is correct format");
    		}    	
    		} else {
        		System.out.println("Year is not in correct format");
       	}
    }
}