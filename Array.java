// Description: This program is built upon using an array to shorten the necessary varaibles, and will then display the results after inputting a limited amount of integer values. (Average, high, low)
//Heath Huskey 3/4/24

import java.util.Scanner;

public class Array

{
    public static void main (String [] args)
    
    {
        Scanner keyboard = new Scanner(System.in);
        
        // My initialized array and variables
        final int array = 20;
        int[] numArray = new int[array];
        int numHighOut = 0; 
        int numLowOut = 2147483647;
        int numInput = 0;
        int loopCount = 0;

        double numTotal = 0;
        double numAverageOut = 0;
        
        
        // Weclome print lines
        System.out.println("Welcome to Basic Array Mayhem!");
        System.out.println("To start enter any integer number 20 times!");
        System.out.println("To leave or stop the program, simply type '-1'.\n");
        
        // First 'for-loo' to ask for user input
            for (int i = 0; i < array; i++)
        {
            System.out.println("Enter array number "+i+ "!" );
            numInput=keyboard.nextInt();
        
            if (numInput != -1 && i <= 20) // Makes sure '-1' is not included in the number array's input for calculations
            {
                numArray[i] = numInput;
            
                if (numArray[i] < numLowOut) // Finds the lowest possible value input
                {
                    numLowOut = numArray[i];
                }
                
                if (numArray[i] > numHighOut) // Finds the highest possible value input
                {
                    numHighOut = numArray[i];
                }
                
            
                numTotal += numArray[i]; // Sets up the variable to contain the total values
                loopCount++; // Tallies everytime the 'for-loop' loops
                
                numAverageOut = numTotal/loopCount; // Calculation for average
                
            }
                // Ends the loop
                else
                {
                    i=20;
                }
        
        }   // Displays results for the inverse array
            System.out.println("Here are the results of your inverse array!");
            
            for (int k = 19; k >= 0; k--) // Helps to inverse the results
            {
                if (!(numArray[k] == 0)) // Helps to get rid of unused placeholders '0'
                {
                    System.out.printf(numArray[k] + ", "); // Print line for inverse array
                }
            }
            // Final display of averave, highest, and lowest value of the array
            System.out.println("\nYour total average is " +numAverageOut+ "!");
            System.out.println("Your highest value is " +numHighOut+ "!");
            System.out.println("Your lowest value is " +numLowOut+ "!");
            System.out.println("That's all folks!");
    }
    
    

}