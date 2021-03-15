public class CourseTest
{
  public static void main(String[] args)
  { Instructor instructor=new Instructor(" Nick Cernean","1234 ");
  TextBook textBook1=new TextBook("Math and Physics","Connan Doyle",1987);
    TextBook textBook2=new TextBook("Info","Nicks",1950);
  Course course=new Course("Informatics",instructor,textBook1);
      course.setSecondaryTextBook(textBook2);
  System.out.println("Course"+course.toString());


  }
}
