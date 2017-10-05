
/**
 * Write a description of class Canteen here.
 *
 * @author Akshat giri
 */
public class Canteen
{
    public static final double CAPACITY_IN_FLUID_OUNCES = 30.0;
    public double capacity;
    /**
     * Constructor fills the capacity to it's full amount.
     */
    public Canteen()
    {
        capacity = CAPACITY_IN_FLUID_OUNCES;
    }
    
    /**
     * Reduces the capacity by the given amount
     * @param amount Reduces the capacity this much
     */
    public void drink(double amount)
    {
        if(amount < capacity)
            capacity = capacity - amount;
    }
    
    /**
     * fills the canteen to it's full capacity
     */
    public void fill()
    {
        capacity = CAPACITY_IN_FLUID_OUNCES;
    }
    
    /**
     * @return capacity The current capacity of the canteen. 
     */
    double getAmount()
    {
        return capacity;
    }
}
