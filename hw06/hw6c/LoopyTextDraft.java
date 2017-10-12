/**
 * Provides some methods to manipulate text
 * 
 */
public class LoopyText
{
    private String text;
    
    /**
     * Creates a LoopyText object with the given text
     * @param theText the text for this LoopyText
     */
    public LoopyText(String theText)
    {
        text = theText;
    }
    
    /**
     * @return A string with every other letter from the text provided
     */
    public String getEverySecondCharacter()
    {
        String everyOtherLetter = "";
        for(int x = 0; x < text.length(); x++)
        {
            if(x%2 == 0)
            {
                everyOtherLetter = everyOtherLetter + text.substring(x, x+1);
            }
        }       
        return everyOtherLetter;
    }
    
    /**
     * @return The cound of all the uppercase letters in the text
     */
    public int upperCaseCount()
    {
        return 0;
    }
    
}
