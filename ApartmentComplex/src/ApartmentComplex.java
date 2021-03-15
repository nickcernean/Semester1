import java.util.ArrayList;

public class ApartmentComplex
{
  private String address;
  private ArrayList<Apartment> apartments;

  public ApartmentComplex(String address)
  {
    this.address = address;
    this.apartments = new ArrayList<>();
  }

  public int getNumberOfApartments()
  {
    return apartments.size();
  }

  public void add(Apartment apartment)
  {
    apartments.add(apartment);
  }

  public Apartment getApartment(int index)
  {
    return apartments.get(index);
  }

  public Apartment getApartmentByNumber(int number)
  {
    for (int i = 0; i < apartments.size(); i++)

      if (apartments.get(i).getNumber() == number)
      {
        return apartments.get(i);
      }

    return null;
  }

  public Apartment getApartmentByNumber(Tenant tenant)
  {
    for (int i = 0; i < apartments.size(); i++)

      if (apartments.get(i).getTenant() == tenant)
      {
        return apartments.get(i);
      }

    return null;
  }

  public Apartment getFirstAvailaibleApartment()
  {
    for (int i = 0; i < apartments.size(); i++)
    {
      if (apartments.get(i).isAvailaile())
        return apartments.get(i);
    }
    return null;
  }

  public String toString()
  {
    String s = "";
    for (int i = 0; i < apartments.size(); i++)
    {
      s += apartments.get(i);
    }

    return "Address:" + address + "Apartments:\n" + s;

  }

}
