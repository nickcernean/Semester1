public abstract class Car
{
  private String licenseNo;
  private double price;
  private Customer rentedTo;

  public Car(String licenseNo, double price)
  {
    this.licenseNo = licenseNo;
    setPrice(price);
    setRentedTo(null);
  }

  public double getPrice()
  {
    return price;
  }

  public String getLicenseNo()
  {
    return licenseNo;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public Customer getRentedTo()
  {
    return rentedTo;
  }

  public void setRentedTo(Customer customer)
  {
    this.rentedTo = customer;
  }

  public boolean isAvalaible()
  {
    return getRentedTo() == null;
  }

  public abstract String getType();

  @Override public String toString()
  {
    return "Car{" + "licenseNo='" + licenseNo + '\'' + ", price=" + price
        + ", rentedTo=" + rentedTo + '}';
  }
}
