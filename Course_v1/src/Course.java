public class Course
{ private String courseName;
private  Instructor who;
private TextBook primaryTextBoook;
private TextBook secondaryTextBook;

public Course(String courseName,Instructor who,TextBook primaryTextBook)
{  this.courseName=courseName;
this.who=who  ;
this.primaryTextBoook=primaryTextBook;
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
      {   return primaryTextBoook; }

      public TextBook getSecondaryTextBook()
      { return secondaryTextBook; }

      public void setSecondaryTextbook(TextBook secondaryTextbook)
          { this.secondaryTextBook=secondaryTextbook;}

          public String toString( String secondaryTextbook)
          { String s="";
           s+=who;
            if(primaryTextBoook!=null)
            { s+="Isn't one boook"+primaryTextBoook; }

            if(secondaryTextbook!=null)
            {s+="Secondary book"+secondaryTextbook;}
            return s;
          }



}
