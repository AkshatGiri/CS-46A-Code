import java.util.ArrayList;
/**
 * A class to manage rectangles
 */
public class Rectangles
{
    ArrayList<Rectangle> list;

    /**
     * Initializes the list Array
     */
    Rectangles(){
        list = new ArrayList<Rectangle>();
    }

    /**
     * Adds the rectangle to the list array
     * @param r Rectangle to be added to the list
     */
    public void add(Rectangle r){
        list.add(r);
    }

    /**
     * Swaps The Rectangles in the list array
     * @param index1 Index of the firt rectangle
     * @param index2 Index of the second rectangle
     */
    public void swap(int index1, int index2){
        if(index1 >= 0 && index1 < list.size() && index2 >= 0 && index2 < list.size()){
            Rectangle rect = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, rect);
        }

    }

    /**
     * @return The largest rectangle in the list
     */
    public Rectangle largest(){
        if(list.isEmpty()){
            return null;
        }
        
        Rectangle largest = new Rectangle(0, 0, 0, 0);
        for(Rectangle rect: list){
            if(rect.getWidth() > largest.getWidth()){
                largest = rect;
            }
        }

        return largest;
    }

    @Override
    public String toString()
    {
        return list.toString();
    }
}
