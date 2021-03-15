import java.util.ArrayList;

public class CarRental
{
  private String companyName;
  private String address;
  private ArrayList<Car> carsForRent;

  public CarRental(String companyName, String address)
  {
    this.companyName = companyName;
    this.address = address;
    this.carsForRent = new ArrayList<>();
  }

  public String getCompanyName()
  {
    return companyName;
  }

  public String getAddress()
  {
    return address;
  }

  public int getNumberOfCars()
  {
    return carsForRent.size();
  }

  public Car getCar(int index)
  {
    return carsForRent.get(index);
  }

  public void addCar(Car car)
  {
    carsForRent.add(car);
  }

  public Car getCarByLicense(String licenseNo)
  {
    for (int i = 0; i < carsForRent.size(); i++)

      if (carsForRent.get(i).getLicenseNo().equals(licenseNo))
        return carsForRent.get(i);

    return null;
  }

  public SportsCar getAvalaibleSportsCar()
  {
    for (int i = 0; i < carsForRent.size(); i++)
    {
      if (carsForRent.get(i).getType().equals("SportsCar"))
      {
        if (carsForRent.get(i).isAvalaible())
          return (SportsCar) carsForRent.get(i);
      }
    }
    return null;
  }

  public Van getAvailaibleVan(int minCapacity)
  {
    for (int i = 0; i < carsForRent.size(); i++)
    {
      if (carsForRent.get(i).getType().equals("Van"))
      {
          int vanCap = ((Van) carsForRent.get(i)).getCapacity();
        if (carsForRent.get(i).isAvalaible()&&vanCap >= minCapacity)
        return (Van) carsForRent.get(i);
      }
    } return null;
  }

  @Override public String toString()
  {
    return "CarRental{" + "companyName='" + companyName + '\'' + ", address='"
        + address + '\'' + ", carsForRent=" + carsForRent + '}';
  }
}
