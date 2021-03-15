public class TwoDimensionalShapeTest
{
  public static void main(String[] args)
  {
    TwoDimensionalShape[] twoDimensionalShapes = new TwoDimensionalShape[4];
    twoDimensionalShapes[0] = new Circle(5, 8, 6);
    twoDimensionalShapes[1] = new Rectangle(4, 5, 5, 9);
    twoDimensionalShapes[2] = new Triangle(2, 1, 9, 3, 9);
    twoDimensionalShapes[3] = new Triangle(4, 3, 11, 12, 4);

    for (int i = 0; i < twoDimensionalShapes.length; i++)
    {
      System.out.println(twoDimensionalShapes[i].getArea());
    }

  }

}
