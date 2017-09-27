
/**
 * Console inputs
 *
 * @author Akshat Giri
 */
import java.util.Scanner;
public class IfPractice
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        int indexOfSpace = name.indexOf(" ");
        String firstName;
        if(indexOfSpace != -1)
            firstName = name.substring(0 , indexOfSpace).toLowerCase();
        else
            firstName = name.toLowerCase();
            
        String nickName;
        
        //Same thing can be done with if and else if statements, I just like using switch
        switch(firstName) 
        {
            case "james":   
                nickName = "Jim";
                break;
            
            case "robert":
                nickName = "Bobby";
                break;
                
            case "ashwani":
                nickName = "Ash";
                break;
            
            default:
                nickName = "Buddy";
                break;
        }
        
        System.out.println("I think I will call you " + nickName);
        
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        
        if(age > 0 && age < 18)
            System.out.println("You are a child, " + nickName);
        else if(age >= 18 && age < 21)
            System.out.println("You can vote, but you can not drink, " + nickName);
        else if(age >=21 && age < 65)
            System.out.println("You are a full adult, " + nickName);
        else
            System.out.println("You can get Social Secutity, " + nickName);
            
        System.out.println("Goodbye, " + name + "!");
    }
}
