/**
 * Tests the methods of LoopyText.
 * @author Kathleen O'Brien 
 */
public class LoopyTextTester
{
    public static void main(String[] args)
    {
        LoopyText loopy = new LoopyText("Java for All");
        System.out.println(loopy.upperCaseCount());
        System.out.println("Expected: 2");
        
        System.out.println(loopy.firstLetters());
        System.out.println("Expected: JfA");
        
        loopy = new LoopyText("Today is the First Day of the Rest of your LIFE!");
        System.out.println(loopy.upperCaseCount());
        System.out.println("Expected: 8");
        
        System.out.println(loopy.firstLetters());
        System.out.println("Expected: TitFDotRoyL");
    }
}