/**
 * Do some input
 */
import java.util.Scanner;
public class InputStuff
{
    static public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your favorite dessert? ");
        String dessert = scan.nextLine();
        System.out.println(dessert);
        dessert = dessert.toLowerCase();
        
        if(dessert.equals("lychee"))
            System.out.println("That grows in Asia");
        else if(dessert.equals("churros"))
            System.out.println("Yummy");
        else if(dessert.equals("chocolate chip cookies"))
            System.out.println("My favorite");
        else
            System.out.println("That is probably good, too");
            
        System.out.print("How many times a week do you eat dessert? ");
        int times = scan.nextInt();
        
        if(times < 0)
            System.out.println("That is impossible");
        else if(times >= 0 && times <= 7)
            System.out.println("Once a day or less");
        else 
            System.out.println("That's a lot");

    }
   
}
