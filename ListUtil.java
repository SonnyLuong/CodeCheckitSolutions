import java.util.*;

public class ListUtil
{
   public static void printEverySecond(List<String> aList)
   {
      ListIterator<String> iterator = aList.listIterator();
      int pos = 0;
      while (iterator.hasNext())
      {
         String s = iterator.next();
         if (pos % 2 == 0)
            System.out.println(s);
         pos++;
         
         
      }
   }
}
