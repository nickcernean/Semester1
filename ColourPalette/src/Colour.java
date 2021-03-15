public class Colour
{
  private int red;
  private int green;
  private int blue;

  public Colour(int red, int green, int blue)
  {
    set(red, green, blue);
  }

  public void set(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed()
  {
    return red;
  }

  public int getGreen()
  {
    return green;
  }

  public int getBlue()
  {
    return blue;
  }

  public boolean isGray()
  {
    if (red == green && red == blue)
      return true;
    return false;
  }

  public void mixWith(Colour colour2)
  {
    this.red = (1 % 2) * red + (1 % 2) * colour2.red;
    this.green = (1 % 2) * green + (1 % 2) * colour2.green;
    this.blue = (1 % 2) * blue + (1 % 2) * colour2.blue;
  }

  public Colour copy()
  {
    Colour other = new Colour(red, green, blue);
    return other;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Colour))
      return false;
    Colour other = (Colour) obj;
    return red == other.red && green == other.green && blue == other.blue;
  }

  @Override public String toString()
  {
    return "Colour{" + "red=" + red + ", green=" + green + ", blue=" + blue
        + "} ";
  }
}
