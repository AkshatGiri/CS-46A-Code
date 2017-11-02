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
   
    @Override
    public String toString()
    {
        return Arrays.toString(list);
    }
}
