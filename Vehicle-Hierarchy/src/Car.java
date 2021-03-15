public class Car extends Vehicle
{
  public String regNo;

  public Car(String theOwner, double thePrice, String regNo)
  {
    super(theOwner, thePrice);
    setRegistrationNumber(regNo);
  }

  public String getRegistrationNumber()
  {
    return regNo;
  }

  public void setRegistrationNumber(String regNo)
  {
    this.regNo = regNo;
  }

  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof Car))
    {
      return false;
    }
    Car other = (Car) obj;
    return super.equals(obj) && regNo.equals(other.regNo);
  }

  @Override public String toString()
  {
    String s = "";
    s = super.toString() + "Car{" + "Registration number:" + regNo + "}";
    return s;
  }

}
