/*
 * 190
 * Ch3_Randoms2 
 * Ch3_Randoms2.java
 * E Miller
 */
 import java.util.Random;
 public class Ch3_Randoms2
{
   public static void main(String[] args)
   {
     Random rg = new Random();
    
     for (int i = 0; i < 50; i++){
       System.out.println(rg.nextInt(30) - 5);
     }
   }
   
 }