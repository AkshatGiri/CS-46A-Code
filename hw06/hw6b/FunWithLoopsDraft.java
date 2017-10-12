/**
 * Write a description of class FunWithLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
                sum = sum + i;
        }
        return sum;
    }
    
    public double average(int count)
    {
        return 0;
    }
    
    public int sumSeries(int value)
    {
        return 0;
    }
    
}
