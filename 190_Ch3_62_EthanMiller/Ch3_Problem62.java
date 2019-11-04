/*
 * 190
 * Ch3_Problem62
 * Ch3_Problem62.java
 * E Miller
 */
import java.util.Scanner;

public class Ch3_Problem62
{
  public static void main(String[] args)
  {
  Scanner kybd = new Scanner(System.in);
  
   //Problem 62
  System.out.println("Problem 62:");
  
  double a = kybd.nextDouble();
  double b = kybd.nextDouble();
  double c = kybd.nextDouble();
  
  double r1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
    
  double r2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
   
    
  System.out.println("Result 1 :" + r1 + " Result 2: " + r2);
    
  }
}
  
    
  /*For a = 1.0, b = 3.0, c = 2.0: The result is -1.0, -2.0
   *For a = 0.5, b = 0.5, c = 0.125: The result is -0.5, -0.5
   *For a = 1.0, b = 3.0, c = 10.0 The result is Not a Number because the program is
   *taking the square root of a negative number and will not work becuause it does not
   * do imaginary numbers
   */

  
  


 