/**
 * Prints how many days until the first day of finals
 * @author Kathleen O'Brien
 */
public class FinalPrinter
{
    public static void main(String[] args)
    {
      
        //leave this line
        Day today = new Day();
        System.out.println("Today is " + today.toString());
        
        //Finals with start on Dec 13, 2017
        Day finalsStart = new Day(2017, 12, 13);
        System.out.println(finalsStart.daysFrom(today));
        
        Day otherDay = new Day();
        otherDay.addDays(100);
        System.out.println(otherDay.getYear());
        System.out.println(otherDay.getMonth());
        System.out.println(otherDay.getDayOfMonth());
    }
}
