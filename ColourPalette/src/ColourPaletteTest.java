public class ColourPaletteTest
{
  public static void main(String[] args)
  {
    Colour[] colour = new Colour[5];
    colour[0] = new Colour(4, 4, 4);
    colour[1] = new Colour(1, 1, 1);
    colour[2] = new Colour(3, 7, 8);
    colour[3] = new Colour(6, 3, 1);
    colour[4] = new Colour(9, 7, 5);

    ColourPalette colourPalette=new ColourPalette(5);

    colourPalette.addColour(colour[0]);
    colourPalette.addColour(colour[1]);
    colourPalette.addColour(colour[2]);
    colourPalette.addColour(colour[3]);
    colourPalette.addColour(colour[4]);
    colourPalette.mixColour(1,colour[3]);
    System.out.println(colourPalette.get(1));
    System.out.println(colourPalette.getNumberOfColours());
    System.out.println(colourPalette.getNumberOfGrayColours());
//    System.out.println(colourPalette);

  }

}
