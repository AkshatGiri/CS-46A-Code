
/**
 * @author Akshat Giri
 */
public class StaticPractice
{
    /**
     * @param numbers an array of ints
     * @return max the biggest number from the array provided
     */
    public static int max(int[] numbers) {
        int max = numbers[0];
        for(int num: numbers){
            if(num > max)
                max = num;
        }
        return max;
    }
}
