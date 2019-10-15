public class ReplaceCheck
{
   /**
      A method to replace letters as follows:
      the letter e becomes 3, the letter i becomes 1,
      the letter l becomes 7, and the letter o becomes 0.
      @param str a string
      @return the string with the characters replaced
   */
   public static String replace(String str)
   {
      String ans = str.replace("e", "3");
      ans = ans.replace("i", "1");
      ans = ans.replace("l", "7");
      ans = ans.replace("o", "0");
      return ans;
   }
}
