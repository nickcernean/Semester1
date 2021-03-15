public class Tenant
{
  private String name;
  private MyDate rentedFrom;

  public Tenant(String name)
  {
    this.name = name;
    setRentedFrom(null);
  }

  public String getName()
  {
    return name;
  }

  public MyDate getRentedFrom()
  {
    return rentedFrom;
  }

  public void setRentedFrom(MyDate date)
  {
    this.rentedFrom = date;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Tenant))
    {
      return false;
    }
    Tenant other = (Tenant) obj;
    return name.equals(other.name) && rentedFrom.equals(other.rentedFrom);
  }

  public String toString()
  {
    String s = "";
    s = "Name:" + name + "Rented from:" + rentedFrom;
    return s;
  }
}
