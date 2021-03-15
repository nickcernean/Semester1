public class Engine
{
  private String type;
  private int horsePower;
  private int volume;
  private boolean isDiesel;

  public Engine(String type, int horsePower, int volume, boolean isDiesel)
  {
    if (type == null)
    {
      type = "";
    }
    this.type = type;
    this.horsePower = horsePower;
    this.volume = volume;
    this.isDiesel = isDiesel;
  }

  public String getType()
  {
    return type;
  }

  public int getHorsePower()
  {
    return horsePower;
  }

  public int getVolume()
  {
    return volume;
  }

  public boolean isDiesel()
  {
    return isDiesel;
  }

  @Override public String toString()
  {
    String s = type + ", " + volume + "  c m3, " + horsePower + " hp, ";
    if (!isDiesel)
    {
      s += " not a ";
    } s += " diesel "; return s;
  }

  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof Engine))
    {
      return false;
    }
    Engine other = (Engine) obj;
    return horsePower == other.horsePower && volume == other.volume
        && isDiesel == other.isDiesel && type.equals(other.type);
  }
}