public class Colour
{
  private int red;
  private int green;
  private int blue;
  private String hex;

  public Colour(int red, int green, int blue)
  {
    if (red < 0 || red > 255)
      this.red = 0;
    else
      this.red = red;
    if (green < 0 || green > 255)
      this.green = 0;
    else
      this.green = green;
    if (blue < 0 || blue > 255)
      this.blue = 0;
    else
      this.blue = blue;

  }

  public Colour(String hex)
  {
    if (hex.length() != 7 && hex.charAt(0) != '#')
    {
      this.red = 0;
      this.green = 0;
      this.blue = 0;
    }
    else
    {
      String red = hex.substring(1, 3);
      String green = hex.substring(3, 5);
      String blue = hex.substring(5, 7);
      this.red = Integer.parseInt(red, 16);
      this.green = Integer.parseInt(green, 16);
      this.blue = Integer.parseInt(blue, 16);

    }

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

  public String toHex()
  {
    String r1, r2, g1, g2, b1, b2;
    r1 = decToHex(this.red / 16);
    r2 = decToHex(this.red % 16);
    g1 = decToHex(this.green / 16);
    g2 = decToHex(this.green % 16);
    b1 = decToHex(this.blue / 16);
    b2 = decToHex(this.blue % 16);

    return String.format("#%s%s%s%s%s%s", r1, r2, g1, g2, b1, b2);




    /* if (red >= 0 && red <= 255)
      return red / 16 + "" + red % 16;
    else
      System.out.println("Error");
    if (green >= 0 && green <= 255)
      return green / 16 + "" + green % 16;
    else
      System.out.println("Error");
    if (blue >= 0 && blue <= 255)
      return blue / 16 + "" + blue % 16;
    else
      System.out.println("Error");

    hex = red + "" + green + "" + blue;*/

  }

  public String decToHex(int toTransform)
  {
    switch (toTransform)

    {
      case 10:
        return "A";
      case 11:
        return "B";
      case 12:
        return "C";
      case 13:
        return "D";
      case 14:
        return "E";
      case 15:
        return "F";
      default:
        return String.valueOf(toTransform);
    }
  }

  //  public String decToHex(int toTransform)
  //  {
  //    switch (toTransform)
  //    {
  //      case "A":
  //        return 10;
  //      case "B":
  //        return 11;
  //      case "C":
  //        return 12;
  //      case "D":
  //        return 13;
  //      case "E":
  //        return 14;
  //      case "F":
  //        return 15;
  //    }
  //  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Colour))
    { return false;
    }
    Colour other=(Colour)obj;
    return red==other.red && green==other.green&&blue==other.blue;
  }

  public String toString()
  {
    return toHex();

  }

}