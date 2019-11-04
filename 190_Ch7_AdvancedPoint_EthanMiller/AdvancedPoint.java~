/*
 * 190
 * Ch7_AdvancedPoint
 * Ch7_AdvancedPoint.java
 * E Miller
 */
public class AdvancedPoint
{
 public double x;
 public double y;
 public String name;
 //Instance Variable
  
 public AdvancedPoint()
  { 
   x = 0;
   y = 0;
   name = "Origin";
  }//Nullary Constructor

  
  public AdvancedPoint(double a,double b, String pointy )
  {
    x = a;
    y = b;
    name = pointy;
  }
  
  public void display()
  {
    System.out.println(name + ": " + "(" + x + "," + y + ")");
  }
  
  //Setters or Mutators
  public void setPoint(double a, double b, String pointy)
  {
    x = a;
    y = b;
    name = pointy;
  }//setPoint
  
  public void setX(double a)
  {
    x = a;
  }//setX
  
  public void setY(double b)
  {
    y = b;
  }//setY
  
  public void setName(String pointy)
  {
    name = pointy;
  }//setName
  
  //Getters or Accessors 
  public double getxVal()
  {
    return x;
  }//getxVal
  
  public double getyVal()
  {
    return y;
  }//getyVal
  
  public String getName()
  {
    return name;
  }
  
  
  public String toString()
  {
    return name + "(" + x + "," + y + ")";
  }//toString
  
 public  static Boolean equals(AdvancedPoint a, AdvancedPoint b)
 {
   final Double EPS = .001;
    double dist = Math.sqrt(Math.pow(a.x - b.x, 2) + (Math.pow(a.y - b.y, 2)));
    if (dist < EPS)
      return true;
    else
      return false;
 }//equals
 
 public Boolean isOrigin()
 {
    return equals(new AdvancedPoint(0, 0, this.getName()));
    
 }//isOrigin
 
 public static AdvancedPoint add(AdvancedPoint a, AdvancedPoint b)
 {
   double xa = a.x + b.x;
   double ya = a.y + b.y;
   return new AdvancedPoint(xa, ya, a.getName() + " " +  "+ " + b.getName() + " " + "= ");
 }//add
 
}
     
  
  
  