public class TimeConvert
{
   /**
      Converts military time to ordinary time.
      @param milTime, the military time provided: hhmm
      @return a string of the form 9:35 am or 7 pm
   */
   public static String militaryToOrdinaryTime(int milTime)
   {
      String result = "";
      int hours = milTime / 100;
      int minutes = milTime % 100;
      if (hours >= 12)
      {
         hours = hours - 12;
         if (minutes == 0)
         {
            result = hours + " pm";
         }
         else result = hours + ":" + minutes + " pm";
      }
      else if (hours < 12)
      {
         if (hours == 0)
         {
            hours = 12;  
         }
         result = hours + ":" + String.format("%02d", minutes) + " am";
      }
      return result;
   }
}
