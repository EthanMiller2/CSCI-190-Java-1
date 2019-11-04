/*
 * 190
 * Ch5_Problem50
 * Ch5_Problem50.java
 * E Miller,
 */
import java.util.Scanner;

public class Ch5_Problem50
{
  public static void main (String [] args)
  {
   Scanner kybd = new Scanner(System.in); 
   int temp = kybd.nextInt();
   
   if (temp >= 90 && temp < 110)
   {
     System.out.println("Temperature: " + temp + "," + " It is probably Summer");
   }  
     else if ( temp < 90 && temp >=70 )
     {
        System.out.println("Temperature: " + temp + "," + " It is probably Spring");
     }
     else if (temp< 70 && temp >= 50)
     {
        System.out.println("Temperature: " + temp + "," + " It is probably Fall");
     }
     else if ( temp < 50 && temp > -5)
     {
        System.out.println("Temperature: " + temp + "," + " It is probably Winter");
     }  
     else if(temp < -5 || temp > 110)
     {
        System.out.println("Temperature: " + temp + "," + " Temperature is outside the valid range");
     }
  }
  
}