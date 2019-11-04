/*
 * 190
 * Ch3_Problem66
 * Ch3_Problems66.java
 * E Miller
 */

import java.util.Scanner;
public class Ch3_Problem66
{
  public static void main( String[] args)
  {
    Scanner kybd = new Scanner(System.in);
    System.out.println("Problem 66:");
    String pnumber = kybd.nextLine();
    int fdash = pnumber.indexOf('-');
    String f3 = pnumber.substring (0, fdash);
   String remainder = pnumber.substring (fdash +1);
   int sdash = remainder.indexOf('-');
   String s3= remainder.substring (0, sdash);
   String remainder2 = remainder.substring (sdash + 1);
   String end = remainder2.substring (0 , 4);
   
    System.out.println(f3 +" " + s3 + " " + end);
    
    
  }
}

                            
