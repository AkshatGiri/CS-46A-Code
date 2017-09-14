/**
 * Hal9000 simulate an AI that interacts with the crew
 * of a space ship.
 * 
 */
public class Hal9000
{
    private String name;
    
    Hal9000(String personName)
    {
        name = personName;
    }
    
    /**
     * Gets the crew member's name.
     * @return Name of the crew member as a String. 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Updating the name of the an existing Crew Member.
     * @param newName New name of the crew member. 
     */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
     * Greet the Crew Member.
     * @return a greeting. "Welcome" + crew member.
     */
    public String greetCrewMember()
    {
        return null;
    }
    
    /**
     * 
     * @param whatToDo A command to Hal.  
     * @return an apology for not doing what asked to do. 
     */
    public String doCommand(String whatToDo)
    {
         return null;
    }
}
