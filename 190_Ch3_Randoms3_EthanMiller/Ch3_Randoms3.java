/*
 * 190
 * Ch3_Randoms3
 * Ch3_Randoms3.java
 * E Miller
 */
 import java.util.Random;
 public class Ch3_Randoms3
{
   public static void main(String[] args)
   {
     Random rg = new Random();
     int negtwentyfives = 0;
     int fives = 0;
     
     for (int i =0; i<1000; i ++)
     {
       System.out.println(rg.nextInt(21) - 25);
       
      int v = rg.nextInt(21) - 25;
      
      if ( v == (-25)) 
        {
        negtwentyfives++;
        }
      if ( v == 5)
        {
        fives++;
        }
                         
      }
     System.out.println("Negative Twenty Fives:" + negtwentyfives );
     System.out.println("Fives:" + fives);  
   }
 }   
     
     
    