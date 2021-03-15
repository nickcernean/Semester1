import java.util.Arrays;

public class ColourPalette
{
  private int numberOfColours;
  private Colour[] colours;

  public ColourPalette(int maxNumberOfColours)
  {
    this.colours = new Colour[maxNumberOfColours];
    this.numberOfColours = 0;
  }

  public int getNumberOfColours()
  {
    return numberOfColours;
  }

  public void addColour(Colour colour)
  {
    colours[numberOfColours] = colour.copy();
    numberOfColours++;
  }

  public Colour get(int index)
  {
    return colours[index].copy();
  }

  public int getNumberOfGrayColours()
  {
    int count = 0;
    for (int i = 0; i < colours.length; i++)
    {
      if (colours[i].isGray())
      {
        count++;
      }
    }
    return count;
  }

  public void mixColour(int index, Colour colour2)
  {
    colours[index].mixWith(colour2);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ColourPalette))
    {
      return false;
    }
    ColourPalette other = (ColourPalette) obj;
    return numberOfColours==other.numberOfColours&&colours.equals(other.colours);
  }

  @Override public String toString()
  {
    return "ColourPalette{" + "numberOfColours=" + numberOfColours
        + ", colours=" + Arrays.toString(colours) + '}';
  }
}
