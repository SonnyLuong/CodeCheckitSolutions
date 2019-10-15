public class Numbers
{
   /**
      Counts the number of 7s in a given number
      @param num a number >= 0
      @return the number of digits in num that are 7
   */
   public static int countSevens(int num)
   {  
      int result = 0;
      String test = Integer.toString(num);
      for (int i = 0; i < test.length(); i++)
      {
         if (test.charAt(i) == '7')
            result++;
      }
      return result;
   }
}
