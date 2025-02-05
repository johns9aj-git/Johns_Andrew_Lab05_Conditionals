/* The following program will allow the user to add the price of items. 
All items above $100 will have a shipping cost of 2% added to the total price. 
The user will be able to see the shipping costs, item cost, and total costs. 
 */


import java.util.Scanner; 

public class ShipCostCalculator {

    public static void main(String[] args)
    {
     // Intialization Phase
    double totalPrice = 0.0; 
    final double SHIPPINGFEE = .02; 
    double shippingTotal = 0.0;

    System.out.println("Warning all items above: $100 will have a shipping fee of 2%"); 

    System.out.print("Please enter the item's price: $");
    Scanner in = new Scanner(System.in); 
    double itemPrice = in.nextDouble();     

    // Processing Phase

    if (itemPrice >= 100) // Item above $100 
    {
        System.out.println("Warning item above $100. Adding shipping rate to price...");
        shippingTotal = itemPrice * SHIPPINGFEE;
        totalPrice = itemPrice + shippingTotal; 
    

    } else if (itemPrice < 100) // Item below $100
    {
        totalPrice = itemPrice; 
    }
    else 
    {
        System.out.println("ERROR: Invalid Character Detected, please try again."); 
        System.exit(0); // Forces Exit 
   }
    // Finalization
    

    System.out.println("Item Price: $" + itemPrice); 
    System.out.println("Shipping Total: $" + shippingTotal);
    System.out.println("Total Price: $" + totalPrice ); 

}


}
