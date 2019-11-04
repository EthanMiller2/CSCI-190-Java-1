/*
 * 190
 * Ch6_GoodPassword
 * Ch6_GoodPassword.java
 * E Miller
 */

import java.util.Scanner;

public class Ch6_GoodPassword
{
  public static void main (String [] args)
  {
    Scanner kybd = new Scanner (System.in);
    boolean goodpassword = false;
    boolean goodcharacter = true;
    boolean allgood = false;
   
    
    
   while (goodpassword == false)
   {
   System.out.println("Enter a password with 8 characters that only contain digits, letters, !, or #: ");
    
   String password = kybd.nextLine();
   int length = password.length();
      
      
      if (length < 8)
      {
         System.out.println("Invalid Password, enter a new password");
         goodpassword = false;
      }
      else if (goodcharacter == true) 
      {
             for(int i = 0; (i < length); i++)
             {
              char character = password.charAt(i);
                 if ('a' <= character && character <= 'z')
                 {
        
                 allgood = true;
                 
                 }
                 else if ('A' <= character && character <= 'Z')
                 
                   allgood = true;
                 
                 else if (character == '!')
                   allgood = true;
                 
                 else if (character == '#')
                   allgood = true;
                 else if (character == '0' || character == '1' || character == '2' || character == '3' || character == '4' || character == '5' || character == '6' || character == '7' || character == '8' || character == '9' )
                  allgood = true;
                 else   
                 {
                  allgood = false;
                  System.out.println("Invalid Password, enter a new password");
                  break;
                  
                 }
              }         
     }
     if (allgood == true)
      {
        goodpassword = true;
        System.out.println("GoodPassword!");
        break;
      }
   }      
   
 }
}



