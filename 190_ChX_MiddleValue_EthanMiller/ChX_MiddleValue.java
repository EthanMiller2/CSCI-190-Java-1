/*
 * 190
 * ChX_MiddleValue
 * ChX_MiddleValue.java
 * E Miller
 */ 

import java.util.Scanner;

public class ChX_MiddleValue
{
  public static int readInt(String s)
  {
    Scanner kybd = new Scanner(System.in);
    System.out.print(s);
    int v = kybd.nextInt();
    return v;
  }//readInt
  
  public static int findMiddle (int a, int b, int c)
  {
    int x = Math.max(Math.min(a,b),Math.min(Math.max(a,b),c));
    return x;
  }//findMiddle
  
  public static void display(int a, int b, int c, int middle)
  {
    System.out.println("The middle value of " + a + ", " + b + ", " + "and " + c + " is: " + middle);
  }//display
  
  public static void main (String args [])
  {
    int a = readInt("First integer: ");
    int b = readInt("Second integer: ");
    int c = readInt("Third integer: ");
    int middle = findMiddle(a, b , c);
    display(a, b, c, middle);
  }//main
}

    