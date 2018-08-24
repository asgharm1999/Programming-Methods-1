/**
 * 
 * @author Muhammad Asghar
 * CMP 167 HW 5
 * Q1: Define a class called Counter 
 *     
 */

public class Counter {
    	
    	// instance variable 
    	private int counter = 0;
    	
    	// sets counter to zero
    	public void setResetCounter() {
    		counter = 0;
    	}
    	
    	// increase counter by one
    	public void setCountInc() {
    		counter += counter;
    	}
    	
    	// decrease counter by one, but not below zero
    	public void setCountDec() {
    		if (counter > 0) {
    			counter -= counter;
    		}
    		else {
    			System.out.println("Counter is zero. A negative counter is not allowed.");
    		}
    	}
    	
    	// return counter value
    	public int getCounterValue() {
    		return counter;
    	}
    	
    	// returns current counter value
    	public void counterToString() {
    		System.out.println("Currently the counter reads: " + counter);
    	}
}