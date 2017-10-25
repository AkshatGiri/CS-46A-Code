import java.util.ArrayList;
/**
 * Write a description of class PracticeWithArrayLists here.
 *
 * @author Akshat Giri
 */
public class PracticeWithArrayLists
{
    public static void main(String[] args){        
        ArrayList<String> zoo = new ArrayList<String>();
        zoo.add("tiger");
        zoo.add("lion");
        zoo.add("elephant");
        zoo.add("kangaroo");
        zoo.add(1, "giraffe");
        zoo.set(4, "zebra");
        zoo.set(zoo.size() - 2, "wallaby");
        zoo.remove("lion");
        System.out.println(zoo.get(0)+"***");
        System.out.println(zoo.toString());
        
        for(String animal: zoo){
            System.out.println(animal);
        }
    }
}
