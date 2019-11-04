/*
 * 190
 * Ch7_TestAdvancedPoint
 * Ch7_TestAdvancedPoint.java
 * E Miller
 */
public class TestAdvancedPoint
{
  public static void main (String [] args)
  {
    System.out.println("Expected- Origin: (0.0,0.0)");
    AdvancedPoint p1 = new AdvancedPoint(0,0, "Origin");
    System.out.print("Actual- ");
    p1.display();
    
    System.out.println("\nExpected- Point1: (3.0,27.0)");
    p1.setPoint(3,27,"Point1");
    System.out.print("Actual- ");
    p1.display();
    
    System.out.println("\nExpected- Point2: (3.0,9.0)");
    AdvancedPoint p2 = new AdvancedPoint(3,9,"Point2");
    System.out.print("Actual- ");
    p2.display();
    
    System.out.println("\nExpected- Point1: (6.0,27.0)");
    p1.setX(6);
    System.out.print("Actual- ");
    p1.display();
    
    System.out.println("\nExpected- Point1: (6.0,9.0)");
    p1.setY(9);
    System.out.print("Actual- ");
    p1.display();
    
    System.out.println("\nExpected- Zebra: (6.0,9.0)");
    p1.setName("Zebra");
    System.out.print("Actual- ");
    p1.display();
    
    System.out.println("\nExpected- 6.0, 9.0");
    double xVal = p1.getxVal();
    double yVal = p1.getyVal();
    System.out.println("Actual- " + xVal + ", " + yVal);
    
    System.out.println("\nExpected- Unequal");
    p1.display();
    p2.display();
    System.out.print("Actual- ");
      if(AdvancedPoint.equals(p1,p2))
        System.out.print("Equal");
      else 
        System.out.print("Unequal");
      
    System.out.println("\n\nExpected- Not Origin");
    System.out.print("Actual- ");
    p1.display();
    if(p1.isOrigin() == true)
      System.out.print("Origin");
    else
      System.out.print("Not Origin");
    
    System.out.println("\n\nExpected- Zebra + Point2 = (9.0,18.0)");
    System.out.print("Actual- ");
    System.out.print(AdvancedPoint.add(p1,p2));
    
      
    
  }
}
    