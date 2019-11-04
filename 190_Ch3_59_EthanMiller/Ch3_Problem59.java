/*
 * 190
 * Ch3_Problem59
 * Ch3_Problems59.java
 * E Miller
 */
import java.util.Random;

public class Ch3_Problem59
{
  public static void main( String[] args)
  {
    System.out.println("Problem 59:");
    Random rg = new Random();
    
     int r1 = (rg.nextInt(100 - 60 + 1) + 60);
     int r2 = (rg.nextInt(100 - 60 + 1) + 60);
     int r3 = (rg.nextInt(100 - 60 + 1) + 60);
     int r4 = (rg.nextInt(100 - 60 + 1) + 60);
     int r5 = (rg.nextInt(100 - 60 + 1) + 60);
     int small = Math.min(r1,r2);
     int smaller = Math.min(small, r3);
     int smallest = Math.min(smaller, r4);
     int smallllest = Math.min (smallest, r5);
     
     System.out.println("Random 1: " + r1);
     System.out.println("Random 2: " + r2);
     System.out.println("Random 3: " + r3);
     System.out.println("Random 4: " + r4);
     System.out.println("Random 5: " + r5);
     System.out.println("Smallest Random: " + smallllest);
  }
}