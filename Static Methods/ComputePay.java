public class ComputePay
{
   /**
      Compute pay (including overtime) for worker. Hours in excess of 40 hours
      are paid at time-and-a-half.
      @param wage the hourly wage for the employee
      @param hoursWorked the number of hours worked by employee in one week
      @return the amount of pay employee earned
   */
   public static double payForWeek(double wage, double hoursWorked)
   {
      double result = 0.0;
      if (hoursWorked > 40)
      {
         result = 40 * wage + (1.5 * (hoursWorked - 40) * wage);
      }
      else result = hoursWorked * wage;
      return result;
   }
}
