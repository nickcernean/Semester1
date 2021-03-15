public class Apartment
{
  private int number;
  private Tenant tenant;

  public Apartment(int number)
  {
    this.number = number;
    this.tenant = null;
  }

  public int getNumber()
  {
    return number;
  }

  public boolean isAvailaile()
  {
    if (tenant == null)
    {
      return true;
    }
    return false;
  }

  public void rentTo(Tenant tenant, MyDate rentedFrom)
  {

    if (isAvailaile())
    {
      this.tenant = tenant;
      this.tenant.setRentedFrom(rentedFrom);
    }
  }

  public Tenant getTenant()
  {
    return tenant;
  }

  public String toString()
  {
    String s = "";
    s = "Apartment Number:" + number + "Tenant:" + tenant + "Availailability:"
        + isAvailaile();
    return s;
  }

}
