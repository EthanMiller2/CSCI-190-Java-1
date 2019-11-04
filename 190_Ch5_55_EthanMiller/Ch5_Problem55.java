/*
 *190
 * Ch5_Problem55
 * Ch5_Problem55.java
 * E Miller
 */
import java.util.Scanner;
public class Ch5_Problem55
{
  public static void main (String [] args)
  {
    //Scanner and Variables
    Scanner kybd = new Scanner(System.in);
    System.out.println("Input a single digit integer from 0 to 9: ");
    int x = kybd.nextInt();
    
    String f1  = " ";
    
    System.out.println("Input another single digit integer from 0 to 9: ");
    int y = kybd.nextInt();
    
    String f2 = " ";
    
    System.out.println("Input an operand from the keyboard (+,-,*,/, or ^): ");
    String z = kybd.next();
    
    String operand = " ";
    Double operator = 0.0;
    
    //First Integer Translation
    
    if(x >= 10)
      f1 = "no!";
    else if (x == 0)
      f1 = "Zero ";
    else if (x == 1)
      f1 = "One ";
    else if (x == 2)
      f1 = "Two ";
    else if (x == 3)
      f1 = "Three ";
    else if (x == 4)
      f1 = "Four ";
    else if (x == 5)
      f1 = "Five ";
    else if (x == 6)
      f1 = "Six ";
    else if (x == 7)
      f1 = "Seven ";
    else if (x == 8)
      f1 = "Eight ";
    else if (x == 9)
      f1 = "Nine ";
    
    //Second Integer Translation
    if (y == 0)
      if(z.charAt(0) != '/')
      f2 = "Zero";
      else 
        f2 = "no!";
    else if (y == 1) 
      f2 = "One ";
    else if (y == 2)
      f2 = "Two ";
    else if (y == 3)
      f2 = "Three ";
    else if (y == 4)
      f2 = "Four ";
    else if (y == 5)
      f2 = "Five ";
    else if (y == 6)
      f2 = "Six ";
    else if (y == 7)
      f2 = "Seven ";
    else if (y == 8)
      f2 = "Eight ";
    else if (y == 9)
      f2 = "Nine ";
    else if (y >= 10)
      f2 = "no!!";
    
    //Operand Translation
    
    if (z.charAt(0) == '+')
      {  
      operand = "added to ";
      operator = (double) x + y; 
      }
    else if (z.charAt(0) == '-')
      {         
      operand = "minus ";
      operator = (double)x - y;
      } 
    else if (z.charAt(0) == '*')
      {         
      operand = "multiplied by ";
      operator = (double) x * y;
      }
    else if (z.charAt(0) == '/')
      {         
      operand = "divided by ";
      operator = (double) x / y;
      }       
    else if (z.charAt(0) == '^')
      {         
      operand = "to the power of ";
      operator = (double) Math.pow(x , y);
      }       
    else
      f2 = "no!!!";
    
    
    //Output
    if (f1 == "no!")
    System.out.println("First integer must be between 0-9!");
    else if (f2 == "no!")
    System.out.println("You cannot divide by 0!");
    else if (f2 == "no!!")
    System.out.println("Second integer must be between 0-9!");
    else if (f2 == "no!!!")
    System.out.println("Operand must be (+, -, *, /, ^)!");
    else
    System.out.println(f1 + operand + f2 + "is " + operator);
  }
}
