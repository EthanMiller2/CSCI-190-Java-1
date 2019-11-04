/*
 * 190
 * Ch6_ForLoopsWorkout
 * Ch6_ForLoopsWorkout.java
 * E Miller
 */

import java.text.DecimalFormat;
public class Ch6_ForLoopsWorkout
{
  public static void main (String [] args)
  {
    
    //Loop1
    System.out.println("Loop1: ");
    
    for (int i = 13; i<= 213; i+=4)
    {
      System.out.print(i + " ");
    }
    //Loop2
    System.out.println("\nLoop2: ");
    DecimalFormat twodigit = new DecimalFormat( "0.00");
    
    for (double i = 1.3; i >= .80; i-=0.05)
    {
      System.out.print(twodigit.format(i) + " ");
    }
           
   //Loop3
   System.out.println("\nLoop3: ");
   
    System.out.println("  1 2 3 4");
    System.out.println("------------");
    
    for (int i = 1; i <= 4; i++)
    {
      System.out.print(i + "|");
      for (int j = 1; j <= 4; j++)
      {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}