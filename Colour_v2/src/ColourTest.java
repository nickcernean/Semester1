public class ColourTest
{
  public static void main(String[] args)
  {
//    Colour colour11 = new Colour(23, 79, 55);
//    System.out.println("Hex colour" + colour11.toHex());
//
//    Colour colour12 = new Colour("#174F37");
//    System.out.println("Hex colour" + colour12.toHex());

    Colour colour0 = new Colour("#000000 ");
    String colour0Name=colour0.getName();
    System.out.println(colour0Name);

    Colour colour1 = new Colour(Colour.COLOUR_CODES[3]);
    String colour1Name=colour1.getName();
    System.out.println(colour1Name);

    Colour colour2 = new Colour("#000044 ");
    String colour2Name=colour2.getName();
    System.out.println(colour2Name);


  }
}
