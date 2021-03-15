public class Van extends Car
{
  private int maxLoad;

  public Van(String theOwner, double thePrice, String regNo, int maxLoad)
  {
    super(theOwner, thePrice, regNo);
    this.maxLoad = maxLoad;
  }

  public int getMaxLoad()
  {
    return maxLoad;
  }

  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof Van))
    {
      return false;
    }
    Van other = (Van) obj;
    return super.equals(obj) && maxLoad == other.maxLoad;
  }

  @Override public String toString()
  {
    String s = "";
    s = super.toString() + "\nVans Max Load:" + maxLoad + "kg";
    return s;

  }
}
