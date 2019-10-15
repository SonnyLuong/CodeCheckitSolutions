public class Strings
{
   /**
      Gets the middle character or character pair from this string 
      when possible.
      @param str a string
      @return the middle character (if the string length is odd) or
      the middle two characters (if it is even), or the empty string if str is
      empty.
   */
   public static String getMiddle(String str)
   {
      String result = "";
      if (str.length() == 0)
         return result;
      if (str.length() % 2 == 1)
         result = str.substring(str.length() / 2, str.length() / 2 + 1);
      if (str.length() % 2 == 0)
         result = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
      return result;
   }
}
