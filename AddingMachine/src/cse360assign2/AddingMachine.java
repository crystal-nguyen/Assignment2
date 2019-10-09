/* Name: Crystal Nguyen
 * ID: 1212428007
 * Class: CSE 360
 * Assignment: 2
 * Description: This class has methods that will perform arithmetic on
 * 				numbers such as adding and subtracting. The class also keeps
 * 				track of the total objects created and can clear the objects.
 */

package cse360assign2;

import java.util.ArrayList;
import java.util.List;

public class AddingMachine 
{
	
	/**
	 * Variable that keeps track of the total amount.
	 */
	private int total;
	
	/**
	 * Array List that will keep track of the history of the parameters.
	 */
	private List <String> history = new ArrayList<>();
	
	
	
	/**
	 * Constructor for the class. 
	 */
	public AddingMachine() 
	{
		total = 0;		//not needed - included for clarity
		history.add(String.valueOf(total));	//add the first total to history
	}
	
	/**
	 * Method that returns the total.
	 * @return returns the total from the object created.
	 */
	public int getTotal() 
	{
		return total;
	}
	
	/**
	 * Method that adds a number to total.
	 * @param value to add to total.
	 */
	public void add(int value) 
	{
		total = total + value;
		
		//cast parameter to a string then add it and the operator to history
		history.add(" + " + String.valueOf(value));
	}
	
	/**
	 * Method that subtracts a number from total.
	 * @param value to subtract from total.
	 */
	public void subtract (int value) 
	{
		total = total - value;
		
		//cast parameter to a string then add it and the operator to history
		history.add(" - " + String.valueOf(value));
	}
	
	/**
	 * Method that prints out history of transactions/calculations.
	 * @return returns a string of the history of transactions/calculations.
	 */
	public String toString() 
	{
		String result = "";
		for (int startingIndex = 0; startingIndex < history.size(); startingIndex++)
		{
			//concatenate the element at startingIndex to result
			result = result + history.get(startingIndex);
		}
		return result;
	}
	
	/**
	 * Method that clears the total and the transaction history.
	 */
	public void clear() 
	{
		total = 0;
		history.clear();
		history.add(String.valueOf(total));
	}
}
