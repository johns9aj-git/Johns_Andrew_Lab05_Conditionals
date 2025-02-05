/* The following program will ask for a user's month. 
It will run if conditions to see if the user has inserted a valid month. 
Example: -1 will output an error because mmonth -1 doesn't exist. 
 */

import java.util.Scanner; 

public class BirthMonth 
{    public static void main(String[] args)
    {
        // Intialization Phase
        System.out.println("Hello, please type birth month here: "); 
        Scanner in = new Scanner(System.in); 
        int birthNum = in.nextInt(); 
        
        // Processing Phase
        if (birthNum >=1 && birthNum <= 12)
        {
            System.out.println("Your birth month is: " + birthNum); 
        } else 
        {
            System.out.println("ERROR: Number outside of acceptable boundries"); 
            System.out.println("Please an insert between and including 1-12"); 
            
        }


    }
}
