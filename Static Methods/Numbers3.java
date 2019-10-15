public class Numbers3
{
   /**
      Returns the number of digits in the binary
      representation of a number
      @param n a nonnegative number
      @return the number of binary digits needed to
      represent n
   */
   
   // TODO: supply the method
   public static int binaryDigits(int n)
   {
      int count = 0; 
      while (n != 0) 
      { 
         count++; 
         n >>= 1; 
      } 
      if (count == 0)
         count = 1;
      return count; 
   }
   
   public static void main(String[] args)
   {
      System.out.println(Numbers.binaryDigits(1000));
   }
}
