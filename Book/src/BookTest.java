public class BookTest
{
  public static void main(String[] args)
  {
    Book[] books = new Book[4];
    books[0] = new PrintedBook("Sherlock Holmes", "313", true);
    books[1] = new PrintedBook("Pdasd", "212", false);
    books[2] = new EBook("www.dsad.com", "Alice in wonderland", "3113");
    books[3] = new EBook("Resda", "123", "www.dsadasd.com");

    for (int i = 0; i < books.length; i++)
    {
      System.out.println(books[i]);
    }

  }

}
