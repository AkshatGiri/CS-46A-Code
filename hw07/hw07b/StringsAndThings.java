
/**
 * Write a description of class StringsAndThings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringsAndThings
{
    String statement;
    /**
     * @param statement 
     */
    public StringsAndThings(String statement)
    {
        this.statement = statement;
    }   

    /**
     * @return The number of non letters in the given statement 
     */
    public int countNonLetters()
    {
        int nonLetters = 0;
        for(int i = 0; i < statement.length(); i++)
        {
            char x = statement.charAt(i);
            if(!Character.isLetter(x))
            {
                nonLetters++;
            }
        }
        return nonLetters;
    }

    /**
     * Checks if the statement has more vowels or consonents. 
     * @return True if the the statement has more vowels than consonants.
     */
    public boolean moreVowels(){
        int consonants = 0;
        int vowels = 0;
        for(int i = 0; i < statement.length(); i++){
            char x = statement.charAt(i);
            if(Character.isLetter(x)){
                if(isVowel(Character.toString(x)))
                    vowels++;
                else
                    consonants++;
            }
        }
        if(consonants > vowels)
            return false; 
            
        return true;
    }

    /**
    Tests whether a letter is a vowel
    @param letter a string of length 1
    @return true if letter is a vowel
     */
    public boolean isVowel(String letter)
    {
        letter = letter.toLowerCase();
        //if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") || letter.equals("y"))
        if(!"aeiouy".contains(letter))
            return false;

        return true;
    }
    
    /**
     * @return A string with no duplicate characters
     */
    public String noDuplicates(){
        String noDup = "";
        for(int x = 0; x < statement.length(); x++){
            String letter = statement.substring(x, x+1);
            if(!noDup.contains(letter))
                noDup = noDup+letter;
        }
        return noDup;
    }
}
