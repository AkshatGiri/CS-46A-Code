/**
 * Models a RightTriangle
 */
public class RightTriangle implements GeometricShape
{
    private int base;
    private int height;

    /**
     * Constructor for objects of class RightTriangle
     * @param base the base of this parallelagram
     * @param height the height of this RightTriangle
     */
    public RightTriangle(int base, int height)
    {
        this.base = base;
        this.height = height;
    }
    
    /**
     * Gets the base of this RightTriangle
     * @return the base of the RightTriangle
     */
    public int getBase()
    {
        return base;
    }
    
    /**
     * Sets the base of the RightTriangle
     * @param newBase the value of the new base
     */
    public void setBase(int newBase)
    {
        base = newBase;
    }
    
    /**
     * Gets the height of this RightTriangle
     * @return the height of the RightTriangle
     */
    public int getHeith()
    {
        return height;
    }
    
    /**
     * Sets the height of the RightTriangle
     * @param newHeight the value of the new height
     */
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }
    
    public double area(){
        
        return 0.5 * base * height;
    }
   
}
