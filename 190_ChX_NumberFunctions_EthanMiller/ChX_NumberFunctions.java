import java.util.Scanner;
public class ChX_NumberFunctions
{
   
  public static void main(String [] args)
  {
  
  boolean primer = true;
  Scanner kybd = new Scanner(System.in);
  while(primer)
   {
    System.out.println("Please choose which function you would like to use: ");
    System.out.println("1: Is the number even?");
    System.out.println("2: Is the number a multiple of 3?");
    System.out.println("3: Is the number a multiple of 6?");
    System.out.println("4: Factorial of the number");
    int x = kybd.nextInt();
    
    if (x == 1)
    {
      int v = kybd.nextInt();
      boolean b1 = isEven(v);
      System.out.println(b1 + "\n");
    }
    else if (x == 2)
    {
      int v = kybd.nextInt();
      boolean b2 =isMult3(v);
      System.out.println(b2 + "\n");
    }
     else if (x == 3)
    {
      int v = kybd.nextInt();
      boolean b3 =isMult6(v);
      System.out.println(b3 + "\n");
    }
    else if (x == 4)
    {
      int v = kybd.nextInt();
      int b4 =fact(v);
      System.out.println(b4 + "\n");
    }
   }
  }
  
  public static boolean isEven(int v)
   {
    return (v % 2 == 0);
   }//isEven
  
  public static boolean isMult3(int v)
  {
    return (v % 3 == 0);
  }//isMult3
  
  public static boolean isMult6(int v)
  {
    return (v % 2 == 0) && (v % 3 == 0 );
  }//isMult6
  
  public static int fact( int v)
  {
    int result = 1;
    for (int i = 1; i <= v; i++)
      result = result*i;
    return result;   
  }
}
  
  
  
