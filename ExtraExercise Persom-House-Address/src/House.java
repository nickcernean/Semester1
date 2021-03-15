public class House
{
  private double size;
  private Address address;

  public House(Address address, double size)
  {
    this.address = address.copy();
    this.size = size;

  }

  public Address getAddress()
  {
    return address;
  }

  public double getSize()
  {
    return size;
  }
}