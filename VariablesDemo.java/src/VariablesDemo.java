/*
 * Filename: VariablesDemo.java
 * Created: 10/28/2017 by Symuel Gaynor
 * 
 * Purpose: Demonstrate numeric and string variables
 */


public class VariablesDemo 
{
	
	// main method
	public static void main( String[] args )
	{
		
		// declare and initialize variables
		String myName = "John Doe", openingMessage, nameMessage, ageMessage,
				weightMessage, heightMessage, outputMessage;
		double myTrueAge = 20.5, myTrueWeight = 170.5, myHeight = 5.833;
		int    myAge, myWeight;
		
		// type cast doubles as integers
		myAge    = (int) myTrueAge;
		myWeight = (int) myTrueWeight;
		
		// build individual strings
		openingMessage = "Welcome to the variables demo!\n\n";
		nameMessage    = "My name is "  +myName    + ".\n";
		ageMessage     = "My age is "   +myAge     + " years.\n";
		weightMessage  = "My weight is "+myWeight  + " pounds.\n";
		heightMessage  = "My height is "+myHeight  + "feet.\n";
		
		// create output string
		outputMessage = openingMessage + nameMessage + ageMessage
				+ weightMessage + heightMessage;
		
		// print output
		System.out.println( outputMessage );
		
	} // end main

} // end class
