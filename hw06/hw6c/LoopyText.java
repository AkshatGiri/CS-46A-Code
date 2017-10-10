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
        int upperCaseLetters = 0;
        for(int x = 0; x < text.length(); x++)
        {
            char c = text.charAt(x);
            if(Character.isUpperCase(c))
            {
                upperCaseLetters++;
            }
        }
        return upperCaseLetters;
    }
    
    /**
     * @return firstLettersw a String containing first letters of all the words in the text provided.
     */
    public String firstLetters()
    {
        if(text.equals("")|| text == null)
            return "";
        
        String firstLetters = "";
        firstLetters = text.substring(0, 1);
        
        for(int x = 1; x < text.length(); x++)
        {
            String charA = text.substring(x -1 , x);
            String charB = text.substring(x, x + 1);
            
            if(charA.equals(" "))
            {
                firstLetters = firstLetters + charB;
            }
        }
        
        return firstLetters;
    }
    
}
