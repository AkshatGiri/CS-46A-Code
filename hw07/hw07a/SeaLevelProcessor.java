
/**
 * Write a description of class Something here.
 *
 * @author Akshat Giri
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SeaLevelProcessor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int value;
        //Needed to be initialized. It is given a new value when the user enters the first number
        int highest = 0;
        double sum = 0;
        int totalCount = 0;
        int countAbove = 0;
        System.out.print("Enter the sea level or Q to quit: ");
        if(scan.hasNextInt()){
            while(scan.hasNextInt()){
                value = scan.nextInt();
                totalCount++;
                if(totalCount == 1)
                    highest = value;
                else
                if(value > highest)
                    highest = value;

                if(value > 0)
                    countAbove++;
                sum += value;
                System.out.print("Enter the sea level or Q to quit: ");
            }
            System.out.println(countAbove);
            System.out.println(highest);
            System.out.println(sum/totalCount);
        }
        else
        {
            System.out.println("No values entered");
        }

    }
}
