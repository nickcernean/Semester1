public class House extends Home
{
  public double price;

  public House(String address, double price)
  {
    super(address);
    this.price = price;

  }

  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof House))
    {
      return false;
    }
    House other = (House) obj;
    return super.equals(obj) && price == other.price;
  }

  public String getInfo()
  {
    return "Address:" + getAddress() + "\nPrice:" + price;
  }

  @Override public String toString()
  {
    return "House{"+super.toString() + "price=" + price + '}';
  }
}
