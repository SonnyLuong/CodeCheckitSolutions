public class SwapTester
{
   /**
      Swaps two values
      @param array an array of length 2 containing the
      values to be swapped
   */
   public static void trueSwap(int[] array)
   {
      // TODO: Complete
      int x = array[0];
      array[0] = array[1];
      array[1] = x;
   }

   public static void main(String[] args)
   {
      int[] xy = new int[2];
      xy[0] = 3;
      xy[1] = 4;
      // TODO: call trueSwap and print swapped values
      trueSwap(xy);
      String result1 = Integer.toString(xy[0]);
      String result2 = Integer.toString(xy[1]);
      System.out.println(result1 + " " + result2);
      System.out.println("Expected: 4 3");
   }
}
