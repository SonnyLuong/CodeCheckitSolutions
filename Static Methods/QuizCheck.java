public class QuizCheck
{
   /**
      Checks whether a string of quiz answers is valid. It must 
      contain an answer A, B, C, or D for each expected answer, or an 
      X to indicate that no answer was provided.
      @param input the answer string
      @param questions the number of questions in the string
      @return true if the string was valid, false otherwise
   */
   public static boolean checkInputs(String input, int questions)
   {
      boolean result = true;
      if (questions != input.length())
         return false;
      for (int i = 0; i < input.length(); i++)
      {
         if (input.charAt(i) != 'A' && input.charAt(i) != 'B' && input.charAt(i) != 'C' && input.charAt(i) != 'D' && input.charAt(i) != 'X')
            result = false;
            
      }
      return result;
   }
}
