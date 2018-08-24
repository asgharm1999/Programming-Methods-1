/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 6
 * Q1: Display all the numbers read, each with an annotation 
 *     giving its percentage contribution to the sum.
 *     
 */

import java.util.Scanner;

public class PercentContribution {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter?");
		int num = keyboard.nextInt();
		
		// loop for inputting as many numbers as the user suggests
		int[] numbers = new int[num];
		System.out.println("Enter " + numbers.length + " integers, one per line: ");
		for (int i = 0; i < num; i++) {
			numbers[i] = keyboard.nextInt();
		}

		// finds the sum
		int sum = calcSum(numbers);
		System.out.println(String.format("The sum of the integers is  %d", sum));
		
		// calculates the percentage of how often a number appears
		double percent;
		int number;
		System.out.println("The numbers are: ");
		for (int i = 0; i < num; i++) {
			number = numbers[i];
			percent = number / (double) sum * 100.00;
			System.out.println(String.format("%d, which is %.4f%% of the sum.",
					number, percent));
		}
}

	// used to calculate the sum
	private static int calcSum(int[] numbers) {
	
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}