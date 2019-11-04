/*
 * 190
 * Ch3_Problems57_58
 * Ch3_Problems57_58.java
 * E Miller
 */
import java.util.Scanner;

public class Ch3_Problems57_58
{
  public static void main(String[] args)
  {
    Scanner kybd = new Scanner(System.in);
    
    //Problem 57
    System.out.println("Problem 57:");
    int qtrs = kybd.nextInt();
    int nkls = kybd.nextInt();
    int dms = kybd.nextInt();
    double q = .25;
    double n = .05;
    double d = .10;
      
    double x = ((qtrs*q) + (nkls*n) + (dms*d));
    System.out.println("Total Money: $" + x);
    
    //Problem 58 
    System.out.println();
    System.out.print("Problem 58:");
    double r = kybd.nextDouble();
    double PI = 3.14;
    double area = (PI*r*r);
    double perimeter = (PI*r*2);
    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
    
  }
}
