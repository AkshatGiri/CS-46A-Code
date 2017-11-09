
/**
 * @author Akshat Giri
 */
public class Plant
{
    private String name;
    private double price;
    
    /**
     * Initializes the variables
     * @param name Name of the plant
     * @param price Price of the plant
     */
    public Plant(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    /**
     * @return name Name of the plant
     */
    public String getName(){
        return name;
    }
    
    /**
     * @return price Price of the plant
     */
    public double getPrice(){
        return price;
    }
    
    /**
     * Changes the name of the plant
     * @param newName Name of the plant
     */
    public void setName(String newName){
        name = newName;
    }
    
    /**
     * Changes the price of the plant
     * @param newPrice Price of the plant
     */
    public void setPrice(double newPrice){
        price = newPrice;
    }
}
