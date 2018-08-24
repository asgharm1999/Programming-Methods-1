/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 5
 * Q2: Write a grading program for an instructor who course as the following policies.
 *     
 */

import java.util.Scanner;

public class Grading {
    	
		// instance variables
		private double quiz1;
		private double quiz2;
		private double midterm;
		private double finalExam;
		private double finalNumberGrade;
		private char finalLetterGrade;
		
    	Scanner keyboard = new Scanner(System.in);
    	
    	// user enters quiz1 grade
    	public void setQuiz1(double quiz1) {
    		System.out.print("Enter your first quiz grade: ");
    		quiz1 = keyboard.nextDouble();
    		if (quiz1 <= 20) {
    			quiz1 = quiz1 * 5;
    			this.quiz1 = quiz1;
    		} else {
    			System.out.println("Quizzes are out of 20.");  
    			System.exit(0);
    		}
    	}
    	
      	// user enters quiz2 grade
    	public void setQuiz2(double quiz2) {
    		System.out.print("Enter your second quiz grade: ");
    		quiz2 = keyboard.nextDouble();
    		if (quiz2 <= 20) {
    			quiz2 = quiz2 * 5;
    			this.quiz2 = quiz2;
    		} else {
    			System.out.println("Quizzes are out of 20.");  
    			System.exit(0);
    		} 
    	}
    	
      	// user enters midterm grade
    	public void setMidterm(double midterm) {
    		System.out.print("Enter your midterm grade: ");
    		midterm = keyboard.nextDouble();
    		if ((midterm > 0) && (midterm <= 100)) {
    			this.midterm = midterm;
    		} else {
    			System.out.println("Midterm is out of 100.");  
    			System.exit(0);
    		} 
    	}
    	
    	// user enters final exam grade
		public void setFinalExam(double finalExam) {
			System.out.print("Enter your final grade: ");
			finalExam = keyboard.nextDouble();
			if ((finalExam > 0) && (finalExam <= 100)) {
				this.finalExam = finalExam;
    		} else {
    			System.out.println("Final exam is out of 100.");  
    			System.exit(0);
    		} 
		}
		
		// calculate the final number and letter grade
		public void setFinalNumberGrade(double finalNumberGrade) {
			finalNumberGrade = ((quiz1 + quiz2)/2 * .25) + (midterm * .25) + (finalExam * .50);
			if ((finalNumberGrade >= 90) && (finalNumberGrade <= 100)) {
				finalLetterGrade = 'A';
	    	} else if ((finalNumberGrade >= 80) && (finalNumberGrade <= 89)) {
	    		finalLetterGrade = 'B';
	    	} else if ((finalNumberGrade >= 70) && (finalNumberGrade <= 79)) {
	    		finalLetterGrade = 'C';
	    	} else if ((finalNumberGrade >= 65) && (finalNumberGrade <= 69)) {
	    		finalLetterGrade = 'D';
	    	} else if ((finalNumberGrade >= 0) && (finalNumberGrade < 65)) {
	    		finalLetterGrade = 'F';
	    	}
			this.finalNumberGrade = finalNumberGrade;
			System.out.println("Your grade is: " + finalNumberGrade + ", a(n) " + finalLetterGrade);
		}
		
		public double getQuizzes() {
			return quiz1;
		}
		
		public double getMidterm() {
			return midterm;
		}
		
		public double getFinalExam() {
			return finalExam;
		}
		
		public double getFinalNumberGrade() {
			return finalNumberGrade;
		}
}