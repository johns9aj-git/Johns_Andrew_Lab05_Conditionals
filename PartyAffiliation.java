

/* This program will ask for the user's partyy affilication 
Optins include: (D)emocractic, (R)epublic, or (I)ndependent
Using the equalsIgnoreCase for string comparisons. 
 */

import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) 
    {
        // Intialzation Phase 
        String userAffiliaction = ""; 
        System.out.println("Hello, please insert your party affiation here: (D)emocratic, (R)epublic, or (I)ndependant: ");
        Scanner in = new Scanner(System.in); 
        String affiliactionChoice = in.next(); 

        // Processeing Phase 
        if (affiliactionChoice.equalsIgnoreCase("d")) // Had to use ignorecase
        {
            userAffiliaction = "Democratic Donkey"; 
        } else if (affiliactionChoice.equalsIgnoreCase("r"))
        {
            userAffiliaction = "Republican Elephant"; 
        } else if (affiliactionChoice.equalsIgnoreCase("i"))
        {
            userAffiliaction = "Indepenadant Person"; 
        } else 
        {
            System.out.println("ERROR: INVALID CHARACTER"); 
            System.out.println("Plesase try again."); 
            System.exit(0); // Forces application to close
        }

        // Finalization Phase

        System.out.println("It looks like you're a(n): " + userAffiliaction);

    

    }
}
