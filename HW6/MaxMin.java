/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 6
 * Q3: Find the maximum and minimum values from an array
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
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
		
		// sort numbers, display the minimum and maximum
		Arrays.sort(numbers);
		System.out.println("Minimum is: " + numbers[0]);
		System.out.println("Maximum is: " + numbers[numbers.length - 1]);
	}
}