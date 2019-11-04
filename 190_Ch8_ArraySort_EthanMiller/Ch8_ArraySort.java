/*
 * 190
 * Ch8_ArraySort
 * Ch8_ArraySort.java
 * E Miller
 */ 

import java.util.Random;
public class Ch8_ArraySort
{
  public static void loadArray(char [] a)
  {
    Random rg = new Random();
    for (int i = 0; i < a.length; i++)
    {
      a[i] = (char) (rg.nextInt(26) + 'a');
    }
  }
  
  public static void sortArray(char [] x)
  {
    for (int i = 0; i < x.length - 1; i++)
    {
      for (int j = 0; j <x.length-i-1; j++)
      {
        if(x[j] >x[j + 1])
        {
          char temp = x[j];
          x[j] = x[j + 1];
          x[j + 1] = temp;
        }
      }
    }
  }
  public static boolean isSorted(char [] x)
  {
    boolean yes = true;
    while (yes == true)
    { 
      for ( int i = 0 ; i < x.length - 1; i++)
      {
        if (x[i] < x[i + 1])
        {
          yes = true; 
          
        }
        else 
        {
          yes = false;
          
        }
      }
      break;
    }
  return yes;
  }
  
  public static void main (String [] args)
  {
    char [] chars = new char[10];
    loadArray(chars);
    System.out.println(chars);
    sortArray(chars);
    System.out.println(chars);
    System.out.println(isSorted(chars));
    
    
    
  }
  
}