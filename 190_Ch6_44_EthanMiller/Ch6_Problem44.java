/*
 * 190
 * Ch6_Problem44
 * Ch6_Problem44.java
 * E Miller
 */

import java.util.Scanner;

public class Ch6_Problem44
{
  public static void main (String [] args)
  {
    Scanner kybd = new Scanner (System.in);
    
    System.out.println("Enter a word with an @ symbol in it: ");
    String word = kybd.nextLine();
    
    while(word.indexOf('@') < 0)
    {
    System.out.println("Enter a word with an @ symbol in it: ");
    word = kybd.nextLine();
    }
    System.out.println(word);
  }
  
}