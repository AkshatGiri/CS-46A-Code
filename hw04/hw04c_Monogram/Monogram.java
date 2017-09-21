/**
 * Write a description of class Monogram here.
 *
 * @author Akshat Giri
 * @version (a version number or a date)
 */
public class Monogram
{
    private String firstName;
    private String middleInitial;
    private String lastName;

    Monogram(String theFirst, String theMiddleInitial, String theLast)
    {
        firstName = theFirst;
        middleInitial = theMiddleInitial.substring(0, 1);
        lastName = theLast;
    }

    Monogram(String theFirst, String theLast)
    {
        firstName = theFirst;
        middleInitial = "";
        lastName = theLast;
    }
    
    /**
     * 
     * @return firstName First name of the person
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * 
     * @return middleInitial Middle Initial of the person
     */
    public String getMiddleInitial()
    {
        return middleInitial;
    }

    /**
     * 
     * @return lastName Last Name of the person
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * 
     * @return Full name of the person
     */
    public String getName()
    {
        return firstName + " " + middleInitial + " " + lastName;
    }

    /**
     * 
     * @return Initials of the person
     */
    public String getMonogram()
    {
        return firstName.substring(0, 1) + middleInitial + lastName.substring(0, 1);

    }
}
