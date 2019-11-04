/*
 * 190 
 * Ch7_TestRational
 * Ch7_TestRational.java
 * E Miller
 */
//TestRationals.java
 
public class TestRational
{
     public static void main(String[] args)
     {
          Rational r1 = new Rational(1, 3);
          Rational r2 = new Rational(-4, 9);
         
          sopl("Testing constructor");
          sopl("Expected: 1/3");
          sop("Actual:");
          System.out.println(r1);
         
          sopl("\n\nTesting add");
          sopl("Expected: -3/27");
          r1.add(r2);
          sop("Actual: ");
          System.out.println(r1);
         
          sopl("\n\nTesting mult");
          sopl("Expected: -4/27");
          r1 = new Rational(1, 3);
          r1.mult(r2);
          System.out.println("Actual: " +r1);
         
          sopl("\n\nTesting equals");
          sopl("Expected: false");
          r1 = new Rational(1, 3);
          sop("Actual: ");
          System.out.println(r1.equals(r2));
          sopl("Expected: true");
          r1 = new Rational(-4, 9);
          sop("Actual: ");
          System.out.print(r1.equals(r2));
         
          sopl("\n\nTesting toDouble");
          sopl("Expected: .33333333");
          r1 = new Rational(1, 3);
          sop("Actual: ");
          System.out.println(r1.toDouble());
         
          sopl("\n\nTesting reduce");
          sopl("Expected: 5/8");
          r1 = new Rational(60, 96);
          sop("Actual: ");
          r1.reduce();
          System.out.println(r1);
     } //main
    
     public static void sopl(String m)
     {   System.out.println(m);   }
    
     public static void sop(String m)
     {   System.out.print(m);   }
    
} //TestRational
