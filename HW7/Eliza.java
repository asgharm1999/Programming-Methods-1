/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 7
 * Q1: Run Eliza program
 * 
 */

import java.util.Scanner;

public class Eliza {
	
	public static void workWithStatement(String statements, String blank1, String blank2) {
		
		String temp = statements;
		temp = 	temp.replaceFirst("BLANK1", blank1);
		temp = temp.replaceFirst("BLANK2", blank2);
		System.out.println(temp);
	}
	
	public static void workWithQuestion(String questions, String blank1, String blank2) {
		
		String temp = questions;
		temp = 	temp.replaceFirst("BLANK1", blank1);
		temp = temp.replaceFirst("BLANK2", blank2);
		System.out.println(temp);
	}
	
	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		PromptBank responses = new PromptBank();
		
		responses.populateStatementsArray();
		responses.populateQuestionsArray();
		
		boolean flag = true;
		
		String blank1; // first word
		String blank2; // last word
		String statement;
		String question;
		
		System.out.println("Hello, my name is Eliza. What is your name?");
		String name = keyboard.nextLine();
		
		System.out.println("Hello " + name + ". What is on your mind today in 1 sentence.");
		String mind = keyboard.nextLine();
		
		String[] mindArray = mind.split(" "); // splits each word into array separated by space
		char lastChar = mind.charAt(mind.length() - 1); 
		
		blank1 = mindArray[0]; // first word
		blank2 = mindArray[mindArray.length - 1]; // last word
	
		while(flag) {
		
		    mindArray = mind.split(" "); // splits each word into array separated by space
			lastChar = mind.charAt(mind.length() - 1); 
			
			blank1 = mindArray[0]; // first word
			blank2 = mindArray[mindArray.length - 1]; // last word
			
			if (lastChar == '.') {
				statement = responses.getRandomStatementTrunk(); // generates random statement
				blank2 = blank2.substring(0, blank2.length() - 1); // since blank2 ends with period,
																   // this will get rid of it
				workWithStatement(statement, blank1, blank2);
				mind = keyboard.nextLine();
			} else if (lastChar == '?') {
				question = responses.getRandomQuestionTrunk(); // generates random questions
				blank2 = blank2.substring(0, blank2.length() - 1); // since blank2 ends with question mark,
																   // this will get rid of it
				workWithQuestion(question, blank1, blank2);
				mind = keyboard.nextLine();
			} else if (lastChar == '!') {
				blank2 = blank2.substring(0, blank2.length() - 1); // since blank2 ends with an 
				   												   // exclamation, this will get rid of it
				System.out.println("WOW! Dramatic! " + blank1 + " and " + blank2 + " sounds cool!");
				mind = keyboard.nextLine();
			} else if (lastChar != '!' || lastChar != '?' || lastChar != '.') { // if not ?!.
				System.out.println("You can exit by typing in \"exit.\"");
				String reply = keyboard.nextLine();
				
				if(reply.equalsIgnoreCase("exit")) {
					System.out.println("Are you sure you want to exit? Yes or no?");
					reply = keyboard.nextLine();
						if(reply.equalsIgnoreCase("yes")) {
							System.out.println("Goodbye, until next time.");
							flag = false;
						}
				}
			}	
		}
	}
}