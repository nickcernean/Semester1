public class Grade
{
  private Course course;
  private int grade;

  public Grade(int grade, Course course)
  {
    this.grade = grade;
    this.course = course;
  }

  public int getGrade()
  {
    return grade;
  }

  public Course getCourse()
  {
    return course;
  }

  public Grade copy()
  {
    return new Grade(grade,course);
  }

  @Override public String toString()
  {
    return " Grade: " + grade+" Course: " + course.getName();
  }

}