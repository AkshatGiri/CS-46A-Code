/**
 * Prints the smallest number of quarters, dimes, nickels 
 * and pennies needed to give the specified amount of change
 * @param changeToGive the amount of change to give
 */

public class printChange{
    public void printChange(int changeToGive)
    {
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;

        int quartersToGive = changeToGive / QUARTER_VALUE; //line 1
        System.out.println("Quarters: " + quartersToGive);
        int remainder = changeToGive - quartersToGive;     //line 2
        System.out.println("Remainder: " + remainder);
        int dimesToGive = changeToGive / DIME_VALUE;       //line 3
        System.out.println("Dimes: " + dimesToGive);
        remainder = changeToGive - dimesToGive;            //line 4 
        System.out.println("Remainder: " + remainder);
        int nickelsToGive = changeToGive / NICKEL_VALUE;   //line 5
        int penniesToGive = dimesToGive - nickelsToGive;   //line 6

        System.out.println("Nickels: " + nickelsToGive);
        System.out.println("Pennies: " + penniesToGive);
    }

}

