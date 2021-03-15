public class Car
{
  public String registrationNumber;
  public int mileage;
  private ServiceBook serviceBook;

  public Car(String registrationNumber, int mileage)
  {
    setRegistrationNumber(registrationNumber);
    this.mileage = mileage;
    this.serviceBook = new ServiceBook();
  }

  public String getRegistrationNumber()
  {
    return registrationNumber;
  }

  public ServiceBook getServiceBook()
  {
    return serviceBook;
  }

  public int getMileage()
  {
    return mileage;
  }

  public void setRegistrationNumber(String registrationNumber)
  {
    this.registrationNumber = registrationNumber;
  }

  public void drive(int mileage)
  {
    this.mileage = mileage;
  }

  public void service(Service service)
  {
    serviceBook.addService(service);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Car))
    {
      return false;
    }
    Car other = (Car) obj;
    return registrationNumber.equals(other.registrationNumber)
        && mileage == other.mileage && serviceBook.equals(other.serviceBook);
  }

  public String toString()
  {
    String s = "";
    s = "Registration number:" + registrationNumber + "Mileage:" + mileage;
    return s;
  }

}
