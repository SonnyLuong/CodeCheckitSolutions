public class InitialsCheck
{
   /**
      Gets the initials of this name
      @params first, middle, and last names
      @return a string consisting of the first character of the first, middle,
      and last name
   */
   public static String getInitials(String one, String two, String three)
   {
      // your work here
      char x = one.charAt(0);
      char y = two.charAt(0);
      char z = three.charAt(0);
      String ans = x + "" + y + "" + z;
      return ans;
   }
}
