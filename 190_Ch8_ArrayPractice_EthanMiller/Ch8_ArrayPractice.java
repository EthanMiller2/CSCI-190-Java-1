/*
 * 190
 * ChX8_ArrayPractice
 * ChX_ArrayPractice.java
 * E Miller
 */ 


import java.util.Random;

public class Ch8_ArrayPractice
{
  
  public static int [] randArray()
  {
    Random rg = new Random();
    int [] x = new int [5];
    for(int i = 0; i < x.length; i++)
    {
      x[i] = rg.nextInt(31)-10;
    }
    return x;
  }
  
  public static void display( int [] x)
  {
    for(int i = 0; i < x.length; i++)
    {
      System.out.print(x[i] + " ");
    }
    System.out.println();
  }
  
  public static void displayBool(boolean [] x)
  {
    for(int i = 0; i < x.length; i++)
    {
    System.out.print( x[i] + " "); 
    }
   System.out.println();   
  }
  
  public static void displayChar(char [] x)
  {
     for(int i = 0; i < x.length; i++)
    {
    System.out.print( x[i] + " "); 
    }
   System.out.println();
  }
  
  public static void xMult2(int [] x)
  {
    for(int i = 0; i < x.length; i++)
    {
      x[i] = x[i] * 2;
    }
  }
  
  public static int totalProd(int [] x)
  {
    int prod = 1;
    for (int i = 0; i <x.length; i++)
    {
      prod = x[i] * prod;
    }
    return prod;
  }
  
  public static int zeroNum( int [] x)
  {
    int count = 0;
    for(int i = 0; i < x.length; i++)
    {
      if(x[i] > 0)
      {
        count++;
      }
    }
    return count;
  }
  
  public static int [] reverseArray(int [] x)
  {
    int [] y = new int [x.length];
    for (int i = 0; i < x.length; i++)
    {
      y[i] = x[x.length - i - 1];
    }
    return y;
  }
  
  public static boolean [] randBoolean()
  {
    Random rg = new Random();
    boolean [] x = new boolean [100];
    for(int i = 0; i < x.length; i++)
    {
      x[i] = rg.nextBoolean();
    }
    return x;
  }
  
  public static double perFalse(boolean [] x)
  {
    double perc = 0;
    int count = 0;
  
    for(int i = 0; i < x.length; i++)
    {
      if(x[i] == false)
      {
        count++;
      }
    }
    perc = (double) count/x.length;
    return perc;
  }
      
  public static char [] strchar(String s)
  {
   char [] x = new char[10];
   for(int i=0; i < s.length(); i++)
   {
     x[i] = s.charAt(i);
   }
   return x;
  }
  
  
  public static void main (String [] args)
  {
    int [] x = randArray();
   int [] y = reverseArray(x);
   boolean [] b = randBoolean();
   display(x);
   xMult2(x);
   display(x);
   System.out.println(totalProd(x));
   System.out.println(zeroNum(x));
   display(y);
   displayBool(b);
   System.out.println(perFalse(b));
   char [] c = strchar("ABCDEFGHIJ");
   displayChar(c);
    
  }
  
  
}