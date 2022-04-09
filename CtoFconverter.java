/**
 * @author Arash
 * This program takes a Celsius temperature input and converts it to its equivalent in Fahrenheit temperature
 * The conversion formula used is: Fahrenheit = 9/5 * Celsius +32 
 */


/**
 * import packets
 */

//import java.util.Scanner; 
import java.util.*;

public class CtoFconverter
{
	public static void main(String[] args) 
	{
		// declare variables
		double fTemp, cTemp;
		
		// creates object scanner
		Scanner keyboard = new Scanner(System.in);
		
		// asks for the user input
		System.out.print("Please enter the current temperature in Celsius: ");
		
		//takes the user input and places it into the cTemp variable 
		cTemp = keyboard.nextDouble(); 
	    
	    // repeats what the user entered 	    
	    System.out.print("You entered the current temperature as " + cTemp + " degrees in Celsius.\n");
	    
		//use the conversion formula to convert Celsius temperature to Fahrenheit temperature
		fTemp = 9.0/5.0*cTemp+32.0;
	    
	    // prints the converted temperature fTemp to the user
	    System.out.print("Your converted temperature of " + cTemp + " Celsius ");
	    System.out.printf("in Fahrenheit is: %.3f degrees.\n", fTemp ); //rounds the decimal up to 3 points

	    //closes object scanner
	    keyboard.close();
	}
}
