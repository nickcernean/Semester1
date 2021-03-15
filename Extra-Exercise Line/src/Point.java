public class Point
{
  private double x;
  private double y;

  public Point(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  public void moveTo(double newX, double newY)
  {
    this.x = newX;
    this.y = newY;
  }

  public void move(double xDistance, double yDistance)
  {
    this.x = x + xDistance;
    this.y = y + yDistance;
  }

  public Point copy()
  {
    Point point = new Point(x, y);
    return point;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Point))
    {
      return false;
    }
    Point other = (Point) obj;
    return x == other.x && y == other.y;
  }

  public String toString()
  {
    return "(" + x + "," + y +")";
  }

}
