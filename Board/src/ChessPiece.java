public class ChessPiece extends Piece
{
  private boolean isWhite;

  public ChessPiece(String name, boolean isWhite)
  {
    super(name);
    this.isWhite = isWhite;
  }

  @Override public String getInfo()
  {
    String piece = "";
    if (isWhite)
      piece = "white piece";
    else
      piece = "black piece";
    return piece;
  }
}
