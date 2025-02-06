/* This program asks people to enter their age. 
It then determines if they're allowed a drinking wristband for the theater. 
Anyone over/equal to 21 will receive a wristband everone else will not. 
 */
import java.util.Scanner;  


public class TheaterKiosk {
    public static void main(String[] args) {
        // Intialization Phase
        final int DRINKINGAGE = 21; 
        System.out.println("All visitors " + DRINKINGAGE + " or older may recieve a drinking wristband."); 
        System.out.println("Please insert your age here: ");
        Scanner in = new Scanner(System.in); 
        int userAge = in.nextInt();


        // Processing Phase

        if (userAge >= DRINKINGAGE)
        {
            System.out.println("Congrats, you get a wristband. Drink reponsibly :)"); 
        }
        else if (userAge < DRINKINGAGE)
        {
            System.out.println("Sorry, you must be " + DRINKINGAGE + " to recieve a wristband, enjoy the show."); 

        }
        else 
        {
            System.out.println("ERROR: INVALID CHARACTER"); 
            System.out.println("Please try again"); 
            System.exit(0);

        }
    }



}
