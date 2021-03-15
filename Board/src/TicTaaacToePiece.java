public class TicTaaacToePiece extends Piece
{
  private boolean isX;

  public TicTaaacToePiece(String name, boolean isX)
  {
    super(name);
    this.isX = isX;
  }

  @Override public String getInfo()
  {
    if (isX)
      return "this is X";
    else
      return "this is O";
  }
}
