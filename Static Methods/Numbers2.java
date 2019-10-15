public class Numbers2
{
   /**
      Combines two numbers with a given operator.
      @param op one of "+", "-", "*", "/", or "^" (for power)
      @param first the first argument
      @param second the second argument
      @return the result of evaluating the operator with the arguments
   */
   public static double evaluate(String op, double first, double second)
   {
      double result = 0.0;
      if (op.charAt(0) == '+')
         result = first + second;
      if (op.charAt(0) == '-')
         result = first - second;
      if (op.charAt(0) == '*')
         result = first * second;
      if (op.charAt(0) == '/')
         result = first / second;
      if (op.charAt(0) == '^')
         result = Math.pow(first, second);
      return result;
   }
}
