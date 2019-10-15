public class ArrayOps
{
   /**
      This method adds up the integer values in an array,
      with the integer sum returned at the end of the method.
      @param values, an array of integers, may be positive or negative
      @ return, the sum of the integers
   */
   public static int sumArray(int values[])
   {

      // your work here
      
      // initialize sum
      int sum = 0;
      // add all elements to sum
      for (int i = 0; i < values.length; i++)
      {
         sum = sum + values[i];
      }
      // return sum
      return sum;
   }
}
