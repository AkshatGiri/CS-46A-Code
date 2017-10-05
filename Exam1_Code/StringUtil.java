/**
 * A class to manipulate a string
 *
 * @author Akshat giri
 */
public class StringUtil
{
    private String phrase;
    public StringUtil(String words)
    {
        phrase = words;
    }
    
    //put your methods here
    public int characterCount() 
    {
        return phrase.length();
    }
    
    public String beginning()
    {
        if(phrase.length() <= 3)
        {
            return phrase;
        }
        else
        {
            return phrase.substring(0, 3);
        }            
    }
    
    public String titleCase()
    {
        String lowerPhrase = phrase.substring(0, 1).toUpperCase();
        lowerPhrase = lowerPhrase + phrase.substring(1, phrase.length()).toLowerCase();        
        return lowerPhrase;
    }
}
