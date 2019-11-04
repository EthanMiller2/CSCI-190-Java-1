/*
 * 190
 * Ch3_PigLatin
 * Ch3_PigLatin.java
 * E Miller
 */

import java.util.Scanner;

public class Ch3_PigLatin
{
  public static void main (String args[] )
  {
     Scanner kybd = new Scanner (System.in);
     System.out.println(" Input a word beginning with a single consonant");
     String PL = kybd.nextLine();
     char fletter = PL.charAt(0);
     String remainder = PL.substring(1);
     System.out.println( "Pig Latin: " + remainder + fletter + "ay");
     
     
       
     
   
   
    
  }
}
