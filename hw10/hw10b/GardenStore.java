import java.util.ArrayList;
/**
 * Keeps track of Plants
 */
public class GardenStore
{
    ArrayList<Plant> plants;
    
    /**
     * Initializes the Array list
     */
    public GardenStore(){
        plants = new ArrayList<Plant>();
    }

    /**
     * @param plant Plant that needs to added to the plants list
     */
    public void add(Plant plant){
        plants.add(plant);
    }

    /**
     * @return ArrayList of all the names of plants in plants ArrayList.
     */
    public ArrayList<String> plantList(){
        ArrayList<String> list = new ArrayList<String>();
        for(Plant plant: plants){
            list.add(plant.getName());
        }
        return list;
    }

    /**
     * @return sum Cost of all plants compined. 
     */
    public double sum(){
        double sum = 0;
        for(Plant plant: plants){
            sum += plant.getPrice();
        }
        
        // Multiplying by 10 to save the 1 decimal place
        // Coverting double into int by rounding to the closest int (up or down) can't use (int)
        // Dividing by 10.0 to covert back to a double and retain the original value
        return Math.round(sum*10) / 10.0;
    }
    
    /**
     * @param plantName Name of the plant. 
     * @return True if plant exists, False if otherwise. 
     */
    public boolean contains(String plantName){
        for(Plant plant: plants){
            if(plantName.equals(plant.getName()))
                return true;
        }
        
        return false;
    }

}
