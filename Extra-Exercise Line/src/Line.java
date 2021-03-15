public class Line
{
  private String colour;
  private Point pointA;
  private Point pointB;

  public Line(Point pointA, Point pointB, String colour)
  {
    setPointA(pointA);
    setPointB(pointB);
    setColour(colour);

  }

  public Line(Point pointA, Point pointB)
  {
    setPointA(pointA);
    setPointB(pointB);
    setColour("Not being defined");
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }

  public String getColour()
  {
    return colour;
  }

  public void setPointA(Point pointA)
  {
    this.pointA = pointA;
  }

  public void setPointB(Point pointB)
  {
    this.pointB = pointB;
  }

  public Point getPointA()
  {
    return pointA;
  }

  public Point getPointB()
  {
    return pointB;
  }

  public double getLength()
  {
    return Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));
  }

  public String toString()
  {
    String s = "";
    s = "A " + colour + " line from (" + pointA.getX() + ", " + pointA.getY()
        + ") to (" + pointB.getX() + "," + pointB.getY()
        + ") with the length equal to " + getLength();
    return s;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Line)
    {
      return false;
    }
    Line other = (Line) obj;
    return pointA.equals(other.pointA) && pointB.equals(other.pointB) && colour
        .equals(other.colour);
  }

  public double getSlope()
  {
    return (pointB.getY() - pointA.getY()) / (pointB.getX() - pointA.getX());
  }

  public double getYIntercept()
  {
    return pointA.getY() - getSlope() * pointA.getX();
  }

  public String getSloperIntercept()
  {

    return "y=" + getSlope() + "x+" + getYIntercept();
  }

  public boolean equalSloperIntercept(Line other)
  {
    if (equals(other))
    {
      return true;
    }
    else return false;
  }

}
