import java.util.ArrayList;

public class Course
{
  private ArrayList<Student> students;
  private String title;
  private Instructor primaryInstructor;
  private Instructor secondaryInstructor;

  public Course(String title, Instructor primaryInstructor)
  {
    this.title = title;
    this.primaryInstructor = primaryInstructor;
    setSecondaryInstructor(null);
    this.students = new ArrayList<>();
  }


  public Instructor getPrimaryInstructor()
  {
    return primaryInstructor;
  }

  public Instructor getSecondaryInstructor()
  {
    return secondaryInstructor;
  }

  public void setSecondaryInstructor(Instructor secondaryInstructor)
  {
    this.secondaryInstructor = secondaryInstructor;
  }

  public void addStudent(Student student)
  {
    students.add(student);
  }

  public int getNumberOfInstructors()
  {
    if (secondaryInstructor == null)
    {
      return 1;
    }
    return 2;
  }

  public int getNumberOfStudents(int semester)
  {
    int count = 0;
    for (int i = 0; i <students.size(); i++)
    {
      if(students.get(i).getSemester()==semester)
      {count ++;}
    }
    return count;
  }

  public Student[] getStudentsBySemester(int semester)
  {
    ArrayList<Student> studentList = new ArrayList<>();
    for (int i = 0; i < students.size(); i++)
    {
      if (students.get(i).getSemester() == semester)
      {
        studentList.add(students.get(i));
      }
    }
    Student[] students = new Student[studentList.size()];
    return studentList.toArray(students);
  }

  public boolean hasStudent(String name)
  {
    for (int i = 0; i < students.size(); i++)
      if (students.get(i).getName().equals(name))
      {
        return true;
      }
    return false;
  }

 public String toString()
  {
    String s = "";
    for (int i = 0; i < students.size(); i++)
    {
      s += students.get(i);
    }
    return s;
  }
}
