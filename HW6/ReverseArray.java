/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 6
 * Q4: Reverse an array of integer values
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
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
		
		// reverse the order
		for(int i = numbers.length - 1; i >= 0; i--) {
			  System.out.println("In reverse order: " + numbers[i]);
		}
	}
}