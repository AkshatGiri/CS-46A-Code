
/**
 * Write a description of class TwoNumbers here.
 *
 * @author Akshat Giri
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TwoNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers (like this: 41.7 -22.5): ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if(num1 == num2)
        {
            System.out.println("The first number is equal to the second");
        }
        else
        {
            if(num1 > num2)
                System.out.println("The first number is greater than second");
            else if(num1 < num2)
                System.out.println("The first number is less than second");

            if(Math.abs((num1 - num2)) <= 0.0001 && Math.abs((num1 - num2)) > 0)
                System.out.println("The numbers are close together");
            else if(Math.abs(num1 - num2) > 10000)
                System.out.println("The numbers are far apart");
                
            if(num1 * num2 > 0)
                System.out.println("The numbers have the same sign");
            else
                System.out.println("The numbers have different signs");

        }    
    }

}
