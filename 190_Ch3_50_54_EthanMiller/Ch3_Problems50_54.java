/*
 * 190
 * Ch3_Problems50_54 
 * Ch3_Problms50_54.java
 * E Miller
 */

import java.util.Scanner;
import java.util.Random;
  
public class Ch3_Problems50_54
{ 
  public static void main (String[] args)
  {
    Scanner kybd = new Scanner(System.in);
    
    //Problem 50
    System.out.println("Problem 50:");
    String p1 = kybd.nextLine();
    String p2 = kybd.nextLine();
     int x = p1.length();
     int y = p2.length();
     int z = Math.min(x , y); 
     System.out.println("Length of Shorter Password: "  + z);
     
     //Problem 51
     System.out.println();
     System.out.println("Problem 51:");
     String domain = kybd.nextLine();
     String dubs = ("www.");
     String com = (".com");
     System.out.println("Damain name: " + dubs + domain + com);
     
     //Problem 52
     System.out.println();
    System.out.println("Problem 52:");
    String word = kybd.nextLine();
    String a = word.toUpperCase();
    String b = word.toLowerCase();
    System.out.println("Original word: " + word);
    System.out.println("All upper case: " + a);
    System.out.println("All lower case: " + b);
    System.out.println("Original word: " + word);
    
    //Problem 53
    System.out.println();
    System.out.println("Problem 53:");
    Random rg = new Random();
    Random rh = new Random();
     int r1 = (rg.nextInt(100) + 1);
     int r2 = (rg.nextInt(100) + 1);
     int smallestrandom = Math.min(r1,r2);
     System.out.println("Random 1: " + r1);
    System.out.println("Random 2: " + r2);
    System.out.println("Smallest Random: " + smallestrandom);
    
    //Problem 54
    System.out.println();
    System.out.println("Problem 54:");
    double cubed = ((double) kybd.nextInt());
    System.out.println("What is it cubed?: " + (cubed*cubed*cubed));
    
    
  }
}