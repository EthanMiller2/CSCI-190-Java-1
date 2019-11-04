/*
 * 190
 * Ch5_Quadtratic
 * Ch5_Quadratic.java
 * E Miller
 */
import java.util.Scanner;

public class Ch5_Quadratic 
{
  public static void main(String[] args)
  {
  Scanner kybd = new Scanner(System.in);
  
  System.out.println("Quadratic");
  
  double a = kybd.nextDouble();
  double b = kybd.nextDouble();
  double c = kybd.nextDouble();
  
  
  double r1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
    
  double r2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
  
  
  if ((b*b) - (4*a*c) < 0)
  {
    System.out.println("NO REAL SOLUTIONS");
  }
    else
    {
  System.out.println("Result 1 :" + r1 + " Result 2: " + r2);
    }
  }
}
  
    
  