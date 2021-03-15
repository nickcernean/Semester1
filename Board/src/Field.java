public class Field
{
  private Piece piece;

  public Field()
  {
    setPiece(null);
  }

  public Field(Piece piece)
  {
    setPiece(piece);
  }

  public void setPiece(Piece piece)
  {
    this.piece = piece;
  }

  public void removePiece()
  {
    this.piece = null;
  }

  public Piece getPiece()
  {
    return piece;
  }

  @Override public String toString()
  {
    return "Field{" + "piece=" + piece + '}';
  }

}
