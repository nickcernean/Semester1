public class Course
{
  private String courseName;
  private Instructor who;
  private TextBook primaryTextBook;
  private TextBook secondaryTextBook;

  public Course(String courseName, Instructor who, TextBook primaryTextBook)
  {
    this.courseName = courseName;
    this.who = who;
    this.primaryTextBook = primaryTextBook;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public String getInstructorName()
  {
    return who.getName();
  }

  public TextBook getPrimaryTextBook()
  {
    return primaryTextBook;
  }

  public TextBook getSecondaryTextBook()
  {
    return secondaryTextBook;
  }

  public void setSecondaryTextBook(TextBook secondaryTextBook)
  {
    this.secondaryTextBook = secondaryTextBook;
  }

  public String toString()
  {
    String s = "";
    s += who;
    if (primaryTextBook != null)
    {
      s += "Primary text book:" + primaryTextBook;
    }
    if (secondaryTextBook != null)
    {
      s += "Secondary text book:" + secondaryTextBook;
    }
    return s;

  }
}
