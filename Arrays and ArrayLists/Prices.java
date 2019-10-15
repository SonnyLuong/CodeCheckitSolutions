import java.util.Scanner;
public class Prices
{
   /**
      A method to determine and return the average price
   */
   public static double averagePrice(double[] priceData)
   {

      // your work here
      double result = 0.0;
      double sum = 0.0;
      for (int i = 0; i < priceData.length; i++)
      {
         sum += priceData[i];
      }
      result = sum / priceData.length;
      return result;


   }
}
