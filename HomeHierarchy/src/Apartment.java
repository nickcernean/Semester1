public class Apartment extends Home
{
  public double rent;

  public Apartment(String address, double rent)
  {
    super(address);
    this.rent = rent;
  }
  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof Apartment))
    {
      return false;
    }
    Apartment other = (Apartment) obj;
    return super.equals(obj) && rent == other.rent;
  }
  public String getInfo()
  {
    return "Address" + getAddress() + "\nRent:" + rent;
  }

  @Override public String toString()
  {
    return "Apartment{"+super.toString() + "rent=" + rent + '}';
  }
}
