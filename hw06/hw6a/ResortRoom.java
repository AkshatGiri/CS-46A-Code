
/**
 * Write a description of class ResortRoom here.
 *
 * @author Akshat Giri
 * @version (a version number or a date)
 */
public class ResortRoom
{
    public static final int OCEAN_SIDE = 0;
    public static final int STREET_SIDE = 1;
    private int occupants;
    private int type;
    public static final int COST_PER_EXTRA_PERSON = 100;

    /**
     * 
     * @param type 0 = Ocean Side and 1 = Street Side room
     * @param numberOfOccupants 
     */
    public ResortRoom(int type, int numberOfOccupants)
    {
        if(type > 1 || type < 0)
            this.type = OCEAN_SIDE;
        else
            this.type = type;

        if(numberOfOccupants <= 0)
            numberOfOccupants = 2;

        setOccupants(numberOfOccupants); 

    }
    
    /**
     * Calculates the amount to be paid for the rooms. 
     * @return Cost of the room
     */
    public double getCost()
    {
        if(occupants <= 2)
        {
            if(type == 0)
                return 250;
            else
                return 175;
        }
        else if(occupants == 3 || occupants ==4)
        {
            if(type == 0)
                return 370;
            else
                return 260;
        }
        else 
        {
            int extraOccupants = occupants - 4;
            int extraCost = COST_PER_EXTRA_PERSON * extraOccupants;
            if(type == 0)
                return 370 + extraCost;
            else
                return 260 + extraCost;

        }

    }

    /**
     * 
     * @return Number of Occupants
     */
    public int getOccupants()
    {
        return occupants;
    }
    
    /**
     * 
     * @param number The number of occupants. 
     */
    public void setOccupants(int number)
    {
        if(number > 0)
            occupants = number;
        else 
            occupants = 2;
    }

    /**
     * 
     * @return Type of room selected. 
     */
    public String getType()
    {
        if(type == 0)
            return "ocean";
        else
            return "street";

    }
}
