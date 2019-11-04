/*
 * 190
 * Ch5_Various_Problems
 * Ch5_Various_Problems.java
 * E Miller,
 */
import java.util.Scanner;

public class Ch5_Various_Problems
{
  public static void main (String args [])
  {
    //Problem 42
    System.out.println("Problem 42:");
    Scanner kybd = new Scanner(System.in);
    final Double bnchmrk = .300;
     
    int hits = kybd.nextInt();
    int atBats = kybd.nextInt();
    double hitpercent = (double) hits / atBats;
   
    
    if ( hitpercent > bnchmrk)
    {
      System.out.println("Batting Average: " + hitpercent + " = ELIGIBLE FOR ALL-STAR GAME");
    }
      else 
      {
      System.out.println("Batting Average: " + hitpercent + " = NOT ELIGIBLE FOR ALL-STAR GAME");
      }
    
    
    //Problem 43
    System.out.println("\nProblem43:");
    System.out.println("Enter a letter from the alphabet:");
    char x = kybd.next().charAt(0);
    ;
    if (x > 'b')
    {
      System.out.println(x + " comes after b in Unicode order.");
    }
      else if (x < 'b')
      {
      System.out.println(x + " comes before b in Unicode order.");
      }
        else
        { 
      System.out.println(x + " :this letter is b.");
        }
    
    //Problem 46
    System.out.println("\nProblem46:");
    System.out.println("Type in an email address:");
    
    String email = kybd.next();
    int notify = email.indexOf('@');
    
    if (notify >= 0)
    {
      System.out.println("This is an email address.");
    }
      else
      {
      System.out.println("This is not an email address.");
      }
    
    //Problem 47
    System.out.println("\nProblem47:");
    System.out.println("Type your Password:");
    String pass = kybd.next();
    
    System.out.println("Retype your password:");
    String pass2 = kybd.next();
    
    if(pass.equals(pass2))
    {
      System.out.println("You are now registered as a new user");
    }
      else
      {
        System.out.println("Sorry, there is a typo in your password");
      }
        
    
  }
}