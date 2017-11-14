/**
 * Manages an array of strings
 *
 */
public class Words
{
    
    private String[] words;
    
    public Words(String[] words ){
        this.words = words;
    }
    
    public String seconds(){
        String x= "";
        for(String word: words){
            x += word.charAt(1) + "*";
        }
        //To remove the extra * at the end
        return x.substring(0, x.length()-1);
    }
}
