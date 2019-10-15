public class ArrayOps2
{
   /**
      This method accepts and integer array as a parameter, and then
      returns the "middle" value of the array.
      For an array of odd length, this would be the actual middle value.
      For an array of even length, there are TWO middle values, so only
      the first of the two values is returned.
      @param values, an array of integers
      @ return, the "middle" element of the array
   */
   public static int middleArray(int values[])
   {

      // your work here
      int result = 0;
      if (values.length % 2 == 1)
      {
         result = values[values.length /2 ];
      }
      if (values.length % 2 == 0)
      {
         result = values[values.length /2 - 1];
      }
      return result;
   }
}
