public class Rectangle extends TwoDimensionalShape
{
  private double width;
  private double height;

  public Rectangle(double x, double y, double width, double height)
  {
    super(x, y);
    setSides(width, height);
  }

  public double getHeight()
  {
    return height;
  }

  public double getWidth()
  {
    return width;
  }

  public void setSides(double width, double height)
  {
    this.width = width;
    this.height = height;
  }

  public double getArea()
  {
    return width * height;
  }
}
