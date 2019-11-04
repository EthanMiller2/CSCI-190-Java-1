/*
 * 190
 * Ch3_StringManipulations1 
 * Ch3_StringManipulations1.java
 * E Miller
 */

import java.util.Scanner;

public class Ch3_StringManipulations1
{
  public static void main (String [] args)
  {
   Scanner kybd = new Scanner(System.in);
   
   System.out.print("Name: ");
   String name = kybd.nextLine();
   
   int firstBlank = name.indexOf(' ');
   String fName = name.substring(0, firstBlank);
   
   String remainder = name.substring(firstBlank+1);

   
   String firstint = fName.substring(0,1);
 
   
   String middleint = remainder.substring(0,1);

   
   int secondBlank = remainder.indexOf(' ');
   String lName = remainder.substring(secondBlank+1);

   
   String lastint = lName.substring(0,1);
   
   System.out.println('|' + fName + " " + lName + '|');
   System.out.println('|' + firstint + ". " + middleint + ". " + lName + '|');
   System.out.println('|' + lName + ", " + fName + " " + middleint + "." + '|');
   System.out.println('|' + firstint + ". " + middleint + ". " + lastint + "." + '|');
     
  }
}
