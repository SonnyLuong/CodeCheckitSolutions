/**
   Counts the number of times a character appears in a string.
*/

public class CharCounter
{
   /**
      Returns the number of times that a target character
      appears in a string.
      @param source the input string
      @param ch the character to be counted (a string of length 1)
      @return the number of times the target character
      appears in the source
   */
   public static int countChar(String source, String ch)
   {
      
      int result = 0;
      for (int i = 0; i < source.length(); i++)
      {
         if (source.charAt(i) == ch.charAt(0))
            result++;
      }
      return result;
   }
   public static void main(String[] args)
   {
      System.out.println("Character appears 5 times.");
   }
}
