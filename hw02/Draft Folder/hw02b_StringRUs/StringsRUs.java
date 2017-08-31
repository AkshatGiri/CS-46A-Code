public class StringsRUs
{
//IGNORECASE false
   public static void main(String[] args)
   {
       String word = "separate"; 
       System.out.println(word.length()*2);
       //String to uppercase
       Print(word.toUpperCase());
       
       //Replacing letters
       String replacedWord = word.replaceAll("t", "7").replaceAll("a", "4").replaceAll("e", "3");
       Print(replacedWord); 
       
       Print(word);
   }
   
   static void Print(String text){
       System.out.println(text);
    }
}
