/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 4
 * Q1: Write a program that reads a list of exam scores given as an integer percentage 
 *     in the range of 0 too 100. 
 *     
 */

import java.util.Scanner;

public class ExamScores {

    public static void main(String[] args) {
    	
    	int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;
        
        int count = 0;
    
        Scanner keyboard = new Scanner(System.in);
        
        // user enters the test scores
    	System.out.println("Enter the test scores, stop it by inputting a negative number.");
    	int score = keyboard.nextInt();

    	// start count at 0 and add 1 each time
    	while(score > 0) {
    		count++;
 
    	// assignment of all the letter grade values
    	if ((score >= 90) && (score <= 100)) {
    		A++;
    	} else if ((score >= 80) && (score <= 89)) {
    		B++;
    	} else if ((score >= 70) && (score <= 79)) {
    		C++;
    	} else if ((score >= 60) && (score <= 69)) {
    		D++;	
    	} else if ((score >= 0) && (score <= 59))  {
    		F++;
    	}
    	
    	// makes sure each score is added and stopped when score < 0
    	score = keyboard.nextInt();
    	}
    	
    	// output the desired results from the question
    	System.out.println("Total number of grades: " + count);
    	System.out.println("Total number of A grades: " + A);
    	System.out.println("Total number of B grades: " + B);
    	System.out.println("Total number of C grades: " + C);
    	System.out.println("Total number of D grades: " + D);
    	System.out.println("Total number of F grades: " + F);
    }
}