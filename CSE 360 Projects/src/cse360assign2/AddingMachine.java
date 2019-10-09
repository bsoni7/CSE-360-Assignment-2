/**
 * Bhavica Soni
 * ID: 1209105868
 * CSE 360 Assignment 2
 * This is an adding machine, which adds the '+' and "-" values to a string
 * so it can display the history of values inputed. 
 */

package cse360assign2;

public class AddingMachine 
{

	private int total;
	private String history;
	
	/**
	 * History starts with the "-" value
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the current total. 
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Adds the value to the total. 
	 * History will simply add the value to the string.
	 */
	public void add (int value) 
	{
		total = value + total;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts the value from the total.
	 * History will simply add the value to the string.
	 */
	public void subtract (int value) 
	{
		total = total - value;	
		history = history + " - " + value;
	}
		
	/**
	 * Returns the string of history.
	 */
	public String toString () 
	{
		return history;
	}

	/**
	 * Clears the string from any values.
	 */
	public void clear() 
	{
		total = 0;
		history = " ";
	}
}


