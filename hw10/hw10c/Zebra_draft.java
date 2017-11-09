
/**
 * @author (your name)
 */
public class Zebra
{
    public static final int NOT_HUNGRY = 1;
    public static final int SOMEWHAT_HUNGRY = 2;
    public static final int HUNGRY = 3;
    public static final int VERY_HUNGRY = 4;
    
    //Private vars
    private int state;
    
    /**
     * Initializes variables
     */
    public Zebra(){
        state = VERY_HUNGRY;
    }
    
    /**
     * The Zebra becomes more hungry if not already VERY_HUNGRY
     */
    public void run(){
    }
    
    /**
     * The Zebra will eat if it is hungry and becomes less hungry
     */
    public void seeFood(){
        
    }
    
    /**
     * Gets the State of the zebra
     * @return state State of the Zebra
     */
    public int getState(){
        return state;
    }
    
    /**
     * Gets the Hungry level of Zebra
     * @return Hungry level of Zebra
     */
    public String getHungerLevel(){
        return null;
    }
}
