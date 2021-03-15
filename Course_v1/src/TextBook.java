public class TextBook
{ private String title;
private String author;
private int year;
  public TextBook( String title,String author,int year)
  { this.title=title;
    this.author=author;
    this.year=year;
  }
  public void set(String title,String author,int year)
  { this.title=title;
  this.author=author;
  this.year=year;
  }
  public String toString()
  { return title+","+author+","+year;


  }


}
