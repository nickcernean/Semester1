public class PrintedBook extends Book
{
  private boolean isPaperback;

  public PrintedBook(String title, String isbn, boolean paperback)
  {
    super(title, isbn);
    this.isPaperback = paperback;
  }

  public boolean isPaperback()
  {
    return isPaperback;
  }

  public String getBookType()
  {
    if (isPaperback)
    {
      return "Paperback";
    }

    return "Hard cover";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof PrintedBook))
    {
      return false;
    }
    PrintedBook other = (PrintedBook) obj;
    return super.equals(obj);
  }

  public String toString()
  {
    String s = "";
    s =  super.toString()+ "\nBook type:" + getBookType()+"\n";
    return s;

  }
}
