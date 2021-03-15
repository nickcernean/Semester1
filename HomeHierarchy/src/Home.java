public abstract class Home
{
  private String address;

  public Home(String address)
  {
    this.address = address;
  }

  public String getAddress()
  {
    return address;
  }

 @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof Home))
    {
      return false;
    }
    Home other = (Home) obj;
    return address.equals(other.address);
  }

  @Override public String toString()
  {
    return "Home{" + "address='" + address + '\'' + '}';
  }

  public abstract String getInfo();

}
