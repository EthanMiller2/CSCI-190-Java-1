/*
 * 190
 * Ch7_TestPoint
 * Ch7_TestPoint.java
 * E Miller
 */
public class TestBasicPoint
{
  public static void main (String [] args)
  {
    System.out.println("The expected default constructor should be (0,0)");
    BasicPoint p1 = new BasicPoint();
    System.out.print("Actual: ");
    p1.display();
    
    System.out.println("The expected point 2 should be (3,6)");
    BasicPoint p2 = new BasicPoint(3,6);
    System.out.print("Actual: ");
    p2.display();
    
    System.out.println("The expected point should be changed to (6,12)");
    p1.setPoint(6,12);
    System.out.print("Actual: ");
    p1.display();
    
    System.out.println("The displayed x and y cooridnates should be 6, 12");
    double xVal = p1.getxVal();
    double yVal = p1.getyVal();
    System.out.println("Actual: " + xVal + ", " + yVal);
    
    System.out.println("It is expected that the points are not equal");
    p1.display();
    p2.display();
    System.out.print("Actual: ");
      if(p1.equals(p2))
        System.out.print("The points are equal");
      else 
        System.out.print("These points are not equal");
  }
}
    