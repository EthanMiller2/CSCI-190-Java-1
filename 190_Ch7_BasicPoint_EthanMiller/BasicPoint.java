/*
 * 190
 * Ch7_BasicPoint
 * Ch7_BasicPoint.java
 * E Miller
 */

public class BasicPoint
{
 public double x;
 public double y;
  
 public BasicPoint()
  { 
   x = 0;
   y = 0;
  }//Nullary Constructor

  
  public BasicPoint(double a,double b)
  {
    x = a;
    y = b;
  }
  
  public void display()
  {
    System.out.println("(" + x + "," + y + ")");
  }
  
  public void setPoint(double a, double b)
  {
    x = a;
    y = b;
  }
  
  public double getxVal()
  {
    return x;
  }
  
  public double getyVal()
  {
    return y;
  }
  
  public String toString()
  {
    return "Point: " +  "(" + x + "," + y + ")";
  }
  
  public Boolean equals(BasicPoint test)
  {
    final Double EPS = .001;
   double dist = Math.sqrt(Math.pow(this.x - test.x, 2) + (Math.pow(this.y - test.y, 2)));
     if (dist <= EPS) 
       return true;
   else 
     return false;
  }
  
  
  
}
     
  
  
  