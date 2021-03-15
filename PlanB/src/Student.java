import java.util.ArrayList;

public class Student
{
  private int studentNumber;
  private String name;
  private ArrayList<Course> courses;
  private ArrayList<Grade> grades;

  public Student(int studentNumber, String name)
  {
    this.studentNumber = studentNumber;
    this.name = name;
    this.courses = new ArrayList<>();
    this.grades = new ArrayList<>();
  }

  public int getStudentNumber()
  {
    return studentNumber;
  }

  public String getName()
  {
    return name;
  }

  public void addCourse(Course course)
  {
    courses.add(course);
  }

  public void addGrade(int grade, Course course)
  {
    for (int i = 0; i < courses.size(); i++)
    {
      if (courses.get(i).equals(course))
      {
        grades.add(new Grade(grade, course));
      }
    }
  }

  public double getGradeAverage()
  {
    int sum = 0;
    for (int i = 0; i < grades.size(); i++)
    {
      sum += grades.get(i).getGrade();
    }
    return (double) sum / (double) grades.size();
  }

  public Grade[] getAllGrades()
  {
    Grade[] gradesArr = new Grade[grades.size()];
    for (int i = 0; i < grades.size(); i++)
    {
      gradesArr[i] = grades.get(i).copy();
    }
    return gradesArr;
  }

  public Course[] getAllCourses()
  {
    Course[] courseArr = new Course[courses.size()];
    for (int i = 0; i < courses.size(); i++)
    {
      courseArr[i] = courses.get(i);
    }
    return courseArr;
  }

  public double getAverageNumberLessons()
  {
    int count = 0;
    for (int i = 0; i < courses.size(); i++)
    {
      count+=courses.get(i).getNumberOfLessons();
    }
    return (double)count/courses.size();
  }

}