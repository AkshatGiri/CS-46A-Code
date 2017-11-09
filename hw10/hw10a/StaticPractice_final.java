import java.util.ArrayList;
/**
 * @author Akshat Giri
 */
public class StaticPractice
{
    /**
     * @param numbers an array of ints
     * @return max the biggest number from the array provided.
     */
    public static int max(int[] numbers) {
        int max = numbers[0];
        for(int num: numbers){
            if(num > max)
                max = num;
        }
        return max;
    }
    
    /**
     * @param numbers ArrayList of ints
     * @return max the biggest number from the arraylist.
     */
    public static int max(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        for(int num: numbers){
            if(num > max)
                max = num;
        }
        return max;
    }
    
    /**
     * Determines if the target is in the array at least two times. 
     * @param list array of ints.
     * @param target number to look for in the list. 
     * @return True if found twice, false otherwise.
     */
    public static boolean containsTwice(int[] list, int target){
        int times = 0;
        for(int num: list){
            if(num == target)
                times++;
        }
        if(times < 2)
            return false;
            
        return true;
    }
    
    /**
     * Determines if the target is in the array at least two times. 
     * @param list ArrayList of ints.
     * @param target number to look for in the list. 
     * @return True if found twice, false otherwise.
     */
    public static boolean containsTwice(ArrayList<Integer> list, int target){
        int times = 0;
        for(int num: list){
            if(num == target)
                times++;
        }
        if(times < 2)
            return false;
            
        return true;
    }
}
