public class Bicycle extends Vehicle
{
  public int gears;

  public Bicycle(String theOwner, double price, int numberOfGears)
  {
    super(theOwner, price);
    setGears(numberOfGears);
  }

  public void setGears(int gears)
  {
    this.gears = gears;
  }

  public int getGears()
  {
    return gears;
  }

  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof Bicycle))
    {
      return false;
    }
    Bicycle other = (Bicycle) obj;
    return super.equals(obj) && gears == other.gears;
  }

  @Override public String toString()
  {
    String s = "";
    s = super.toString() + "\nNumber of gears:" + gears;
    return s;
  }

}

