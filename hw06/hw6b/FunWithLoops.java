
/**
 * Write a description of class FunWithLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FunWithLoops
{
    public int sumOdd(int value)
    {   
        if(value < 0)
            return 0;
            
        int sum = 0; 
        for(int i = 0; i < value; i++)
        {
            if(i % 2 != 0)
                System.out.println(i);
                sum = sum + i;
        }
        return sum;
    }
    
    public double average(int count)
    {
        double average; 
        double sum = 0; 
        Scanner scan = new Scanner(System.in);
        for(int i = 1; i <= count; i++)
        {
            System.out.print("Enter integer " + i + ": ");
            int number = scan.nextInt();
            sum = sum + number;
        }
        if(count > 0)
            average = sum / count;
        else
            average = 0;
        return average;
    }
    
    public double sumSeries(int value)
    {
        double sum = 1;
        if(value%2 != 0  && value > 0)
        {
            for(double i = 3; i <= value; i += 2)
            {
                sum = sum + (i-2)/i;
            }
            return sum;
        }
        else
        {
            return 0;
        }
    }
    
}
