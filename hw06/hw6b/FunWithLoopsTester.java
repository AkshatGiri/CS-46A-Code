/**
 * Tests the methods of the FunWithLoops class
 */
public class FunWithLoopsTester
{
    public static void main(String[] args)
    {
        FunWithLoops looper = new FunWithLoops();
        
        System.out.println(looper.average(0));
        System.out.println("Expected: 0.0");
        
        System.out.println(looper.average(-2));
        System.out.println("Expected: 0.0");
         
        System.out.println(looper.sumSeries(0));
        System.out.println("Expected: 0.0");
        
        System.out.println(looper.sumSeries(1));
        System.out.println("Expected: 1.0");
        
        System.out.printf("%.5f%n", looper.sumSeries(5));
        System.out.println("Expected: 1.93333");
        
        System.out.printf("%.5f\n",looper.sumSeries(7));
        System.out.println("Expected: 2.64762");
        
        
        

        
       
    }
}