public class SportsCar extends Car
{
  private int maxVelocity;

  public SportsCar(String theOwner, double thePrice, String regNo,
      int maxVelocity)
  {
    super(theOwner, thePrice, regNo);
    this.maxVelocity = maxVelocity;

  }
  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof SportsCar))
    {
      return false;
    }
   SportsCar other = (SportsCar) obj;
    return super.equals(obj) && maxVelocity==other.maxVelocity;
  }
  @Override public String toString()
  {
    String s = "";
    s = super.toString() +" SportCar Max Velocity:"+maxVelocity+"km/h";
    return s;
  }
}
