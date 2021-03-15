public class FamilyCar extends Car
{
  private int seats;

  public FamilyCar(String licenseNo, double price, int seats)
  {
    super(licenseNo, price);
    this.seats = seats;
  }

  public int getSeats()
  {
    return seats;
  }

  @Override public String getType()
  {
    return "FamilyCar";
  }

  @Override public String toString()
  {
    return "FamilyCar{"+super.toString() + "seats=" + seats + '}';
  }
}
