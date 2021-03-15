public class SportsCar extends Car
{
  public SportsCar(String licenseNo, double price)
  {
    super(licenseNo, price);

  }

  @Override public String getType()
  {
    return "SportsCar";
  }

  @Override public String toString()
  {
    return super.toString();
  }
}
