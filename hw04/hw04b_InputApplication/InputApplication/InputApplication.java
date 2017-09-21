
/**
 * Console inputs
 *
 * @author Akshat Giri
 */
import java.util.Scanner;
public class InputApplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println(word.substring(word.length() - 1));
        
        System.out.print("Enter a double: ");
        double number = scanner.nextDouble();
        //System.out.println(number);
        
        System.out.print("Enter an integer: ");
        int number2 = scanner.nextInt();
        
        System.out.println("Product: " + number * number2);
        System.out.println("Integer portion: " + (int)(number * number2));
    }
}
