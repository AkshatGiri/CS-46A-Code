/**
 * models a rectangular window with a semi-circle on top
 */

// TODO : JUST NEED TO ADD JAVADOC
public class Window
{
    private static final double  COST_PER_OUNCE = 2.54;  //constant
    private static final int SQUARE_INCHES_PER_SQUARE_FOOT = 144; //constant
    private final static int SQUARE_INCHES_PER_OUNCE_OF_GLAZE = 10; //constant

    private double width;
    private double height;

    //put your constructor here
    Window(double theWidth, double theHeight){
       if(theWidth > 0 && theHeight > 0)
       {
         width = theWidth;
         height = theHeight;
       }
       else
       {
          width = 0;
          height = 0;
       }
    }

    /**
     * Gets the width of this Window
     * @return the width of the Window
     */
    public double getWidth()
    {
        return width;    
    }

    /**
     * Gets the height of this Window
     * @return the height of the Window
     */
    public double getHeight()
    {
        return height;
    }
    
    /**
     * Sets the dimensions of this Window
     * @param theWidth Width of the window
     * @param theHeight Height of the window
     */
    public void setDimensions(double theWidth, double theHeight)
    {
       if(theWidth > 0 && theHeight > 0)
       {
         width = theWidth;
         height = theHeight;
       }
    }
    
    /**
     * Calculates the area of the window
     * @return The area of this Window
     */
    public double getArea()
    {
        double radius = width/2;
        double area = (width * height) + ((Math.PI * radius * radius)/2);
        area = area * SQUARE_INCHES_PER_SQUARE_FOOT;
        return area;
    }
    
    /**
     * Calculates the cost in $ that is required to cover the whole window. 
     * @return $ of glaze required
     */
    public double getCostOfGlaze()
    {
        return glazeNeeded()*COST_PER_OUNCE;
    }
    
    /**
     * Calculates the glaze needed to cover the whole Window.
     * @return the amount of glaze needed
     */
    public double glazeNeeded()
    {
        return getArea()/SQUARE_INCHES_PER_OUNCE_OF_GLAZE;
    }

}
