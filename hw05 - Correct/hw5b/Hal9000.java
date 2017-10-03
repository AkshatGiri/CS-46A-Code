/**
 * Hal9000 simulate an AI that interacts with the crew
 * of a space ship.
 * 
 */
public class Hal9000
{
    private String name;
    
    /**
    *Takes in the name of the person.
    *@param personName Name of the person 
    */
    public Hal9000(String personName)
    {
      if(personName.equals("Robert"))
         name = "Bob";
      else if(personName.length() < 9)
         name = personName;
      else
         name = personName.substring(0, 8);
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
      if(newName.equals("Robert"))
         name = "Bob";
      else if(newName.length() < 9)
         name = newName;
      else
         name = newName.substring(0, 8);
    }
    
    /**
     * Greet the Crew Member.
     * @return a greeting. "Welcome" + crew member.
     */
    public String greetCrewMember()
    {
        return "Welcome, " + name;
    }
    
    /**
     * 
     * @param whatToDo A command to Hal.  
     * @return an apology for not doing what asked to do. 
     */
    public String doCommand(String whatToDo)
    {
        return "I am sorry, " + name +". I can't "+ whatToDo;
    }
    
}
