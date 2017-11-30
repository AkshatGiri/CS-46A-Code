/**
 * Models a plant with a name and a price
 */
public class Plant implements Comparable
{
    private String name;
    private double price;
    /**
     * Constructs a new Plant
     * @param name the Plant's name
     * @param price the price of the Plant
     */
    public Plant(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    /**
     * Gets the Plant's name
     * @return the name of the Plant
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the Plant's price
     * @return the price of the Plant
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Sets a new name for the Plant
     * @param newName the new name for the Plant
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * Sets a new price for the Plant
     * @param price the new price for the Plant
     */
    public void setPrice(double price)
    {
        this.price = price;
    }   

    public int compareTo(Object obj){
        Plant plantObj = (Plant) obj;
        if(this.getPrice() != plantObj.getPrice()){
            return Double.compare(this.getPrice(), plantObj.getPrice());
        } else{
            return this.getName().compareTo(plantObj.getName());
        }
    }

}
