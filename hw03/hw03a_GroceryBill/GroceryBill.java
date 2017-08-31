/**
models a grocery bill to which the cost of 
items can be added and removed
 */
public class GroceryBill
{
    public double subTotal;
    
    GroceryBill(){
        subTotal = 0;
    }
    /**
     * Adds the amount to the existing Subtotal.
     * @param amount Amount to be added to the Subtotal
     */
    public void add(double amount)
    {
        subTotal += amount;
    }
    
    /**
     * Subtracts the amount from the Subtotal.
     * @param amount Amount to be removed from the Subtotal
     */
    public void remove(double amount)
    {
        if(subTotal >= amount){
            subTotal -= amount;
        }
    }
    
    /**
     * Returns the Subtotal
     * @return subTotal Total of the Bill so far
     */
    public double getSubtotal()
    {
        return subTotal;
    }
}
