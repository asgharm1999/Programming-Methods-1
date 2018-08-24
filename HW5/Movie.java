/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 5
 * Q3: Consider a class Movie that contains information about a movie.
 *     
 */

import java.util.Scanner;

public class Movie {
    	
		// instance variables
		private String movieName;
		private int movieRating;
		private double average;
		private int terrible = 0;
		private int bad = 0;
		private int ok = 0;
		private int good = 0;
		private int great = 0;
		
    	Scanner keyboard = new Scanner(System.in);
    	
    	// add movie name
    	public void setMovieName(String movieName)	{
    		System.out.print("Enter the name of the movie: ");
    		movieName = keyboard.next();
    		this.movieName = movieName;
    	}
    	
    	// increments the rating
    	public void setMovieRating(int movieRating)	{
    		System.out.println("Enter a rating of the movie from 1 to 5");
    		movieRating = keyboard.nextInt();
    		switch (movieRating) {
    				case 1: 
    					terrible++;
    					break;
    				case 2: 
    					bad++;
    					break;
    				case 3: 
    					ok++;
    					break;
    				case 4: 
    					good++;
    					break;
    				case 5: 
    					great++;
    					break;
    				default: 
    					System.out.println("You did not enter a value from 1 to 5.");
    					break;
    		}
    	}
    	
    	// calculates the average of the reviews
    	public void setAverage(double average) {
    		this.average = average;
    	}
    	
    	public String getName()	{
    		return movieName;
    	}
    	
    	public int getRating() {
    		return movieRating;
    	}
    	
    	public double getAverage() {
    		Math.round(((terrible * 1) + (bad * 2) + (ok * 3) + (good * 4) + (great * 5))/5.00);
    		return average;
    	}
    	
    	// write movie as a string (to be compared later)
    	public String toString() {
    		return "Name: " + movieName + "\nRating: " + movieRating + 
    				"\nAverage Review " + average;
    	}

    	public void display() {
			System.out.println("Name: " + getName());  
			System.out.println("Rating: " + getRating());
			System.out.println("Average Review: " + getAverage());
			System.out.println(terrible + " people have rated this movie as terrible.");
			System.out.println(bad + " people have rated this movie as bad.");
			System.out.println(ok  + " people have rated this movie as OK.");
			System.out.println(good + " people have rated this movie as good.");
			System.out.println(great + " people have rated this movie as great.");
		}
    	
    	// if movie have the same review
    	public boolean equal(Movie otherMovie) {
    		return (this.movieRating == otherMovie.movieRating) && (this.average == otherMovie.average);
    	}
}