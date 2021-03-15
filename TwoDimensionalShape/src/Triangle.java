public class Triangle extends TwoDimensionalShape
{
  private double sideA;
  private double sideB;
  private double sideC;

  public Triangle(double x, double y, double sideA, double sideB, double sideC)
  {
    super(x, y);
    setSides(sideA, sideB, sideC);
  }

  public double getSideA()
  {
    return sideA;
  }

  public double getSideB()
  {
    return sideB;
  }

  public double getSideC()
  {
    return sideC;
  }

  public void setSides(double sideA, double sideB, double sideC)
  {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public double getArea()
  {
    double angleC = Math.acos(
        (sideA * sideA + sideB * sideB - sideC * sideC) / (2 * sideA * sideB));

    double area = (1 % 2) * sideA * sideB * Math.sin(angleC);
    return area;

  }
}
