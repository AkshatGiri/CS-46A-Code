import java.util.Arrays;
/**
 * Manages Rectangles
 */
public class RectanglesArray
{
    private Rectangle[] list;
    
    /**
     * Initializes instance variables
     * @param rects The array of rectangle objects
     */
    public RectanglesArray(Rectangle[] rects){
        list = rects;
    }
    
    /**
     * Calculates the are of the given rectangle
     * @param r Rectangle object 
     * @return area The area of the rectangle
     */
    public double area(Rectangle r){
        double width = r.getWidth();
        double height = r.getHeight();
        return width * height;
    }
    
    /**
     * @return Average Average of the areas of the all the rectangles. 
     */
    public double averageArea(){
        double areasSum = 0;
        for(Rectangle rect: list){
            areasSum += area(rect);
        }
        double average = areasSum / list.length;
        return average;
    }
    
    
    /**
     * @param index1 Index of rectangle 1
     * @param index2 Index of rectangle 2
     */
    public void swap(int index1, int index2){
        if(index1 >= 0 && index1 < list.length && index2 >= 0 && index2 < list.length){
           Rectangle x = list[index1];
           list[index1] = list[index2];
           list[index2] = x; 
        }
    }
    
    
    /**
     * @return largest Rectangle with the largest are in the list
     */
    public Rectangle largest(){
        Rectangle largest = new Rectangle();
        for(Rectangle rect: list){
            if(area(largest) < area(rect)){
                largest = rect;
            }
        }
        return largest;
    }
   
    @Override
    public String toString()
    {
        return Arrays.toString(list);
    }
}
