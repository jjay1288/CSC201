//Ronald Phillips
// Fig. 8.6: Time2Test.java
// Overloaded constructors used to initialize Time2 objects.

public class Time2Test 
{
   public static void main(String[] args)
   {
      Time2 t1 = new Time2(12, 57, 58); // 12:55:55
displayTime("Time Set", t1);
t1.tick();
displayTime("Ticking 1 second", t1);
t1.tick();
displayTime("Ticking into next minute", t1);
t1.incrementMinute();
displayTime("Ticking 1 minute", t1);
t1.incrementMinute();
displayTime("Ticking into next hour", t1);
t1.setHour(22);
t1.setMinute(1);
t1.setSecond(0);
displayTime("Setting Time to 2201 Hours", t1);
t1.incrementHour();
displayTime("Ticking 1 hour", t1);
t1.incrementHour();
displayTime("Ticking into next day", t1);



   } 

   // displays a Time2 object in 24-hour and 12-hour formats
   private static void displayTime(String header, Time2 t)
   {
      System.out.printf("%s%n   %s%n   %s%n",
         header, t.toUniversalString(), t.toString());
   } 
} // end class Time2Test


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
