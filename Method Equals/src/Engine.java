public class Engine
{
  private String type;
  private int horsePower;
  private int volume;
  private boolean isDiesel;

  public Engine(String type, int horsePower, int volume, boolean isDiesel)
  {
    this.type = type;
    this.horsePower = horsePower;
    this.volume = volume;
    this.isDiesel = isDiesel;
  }

  public Engine(String type, int horsePower, int volume)
  {
    this.type = type;
    this.horsePower = horsePower;
    this.volume = volume;
    this.isDiesel = true;
  }

  public String getType()
  {
    return type;
  }

  public int getHorsePower()
  {
    return horsePower;
  }

  public boolean isDiesel()
  {
    return isDiesel;
  }

  public int getVolume()
  {
    return volume;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Engine))
    {
      return false;
    }
    Engine other = (Engine) obj;
    return type.equals(other.type) && horsePower == other.horsePower &&
    volume == other.volume&&isDiesel == other.isDiesel;
  }

  public String toString()
  {
    return "Type:" + type + "\nHorse Power:" + horsePower + "\nVolume:" + volume
        + "\nDiesel or not:" + isDiesel;

  }
}
