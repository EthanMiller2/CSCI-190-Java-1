/*
 * 190
 * Ch6_Problem43
 * Ch6_Problem43.java
 * E Miller,
 */
import java.util.Scanner;

public class Ch6_Problem43
{
  public static void main (String [] args)
  {
    final double EPS = 1.01;
    Scanner kybd = new Scanner(System.in);
    
    System.out.print("Value? ");
    
    double v = kybd.nextDouble();
    
    while(v <= 10)
    {
      System.out.print("Value? ");
    
      v = kybd.nextDouble();
    }
    
    double sqrt = Math.sqrt(v);
    int count = 1;
    while (sqrt >= EPS)
    {
      sqrt = Math.sqrt(sqrt);
      count++;
    }
    System.out.println("It took " + count + " square roots");
    
  }
}

