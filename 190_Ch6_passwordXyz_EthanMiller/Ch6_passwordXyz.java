/*
 * 190
 * Ch6_passwordXyz
 * Ch6_passwordXyz.java
 * E Miller
 */

import java.util.Scanner;

public class Ch6_passwordXyz
{
  public static void main (String [] args)
  {
    Scanner kybd = new Scanner (System.in);
    String pw;
    int count = 0;
    
    do{
       System.out.println("Password: ");
      
      pw = kybd.nextLine();
      count++;
    }
    while (pw.equals( "xyz") == false);
    
    System.out.println("Congrats! You have entered the correct pssword!");
    System.out.println("Incorrect entries: " + (count -1));
  }
}