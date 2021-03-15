import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList
{
  private ArrayList<Student> students;

  public StudentList()
  {
    this.students = new ArrayList<>();
  }

  public StudentList(Student[] initialmembers)
  {
     this.students=new ArrayList<Student>(Arrays.asList(initialmembers));
  }

  public int size()
  {
    return students.size();
  }

  public void addStudent(Student student)
  {
    students.add(student);
  }

  public void removeStudent(int index)
  {
    students.remove(index);
  }

  public Student get(int index)
  {
    return students.get(index);
  }

  public Student getByStudyNumber(int studyNumber)
  {
    for (int i = 0; i < students.size(); i++)
    {
      if (studyNumber == students.get(i).getStudyNumber())
        return students.get(i);
    }
    return null;
  }

  public int getNumberOfGroupMembers(int groupNumber)
  {
    int count = 0;
    for (int i = 0; i < students.size(); i++)
    {
      if (groupNumber == students.get(i).getGroupNumber())
        count++;
    }
    return count;
  }

  public Student[] getByGroup(int groupNumber)
  {
    int s = size();
    Student[] students1 = new Student[s];
    for (int i = 0; i < students.size(); i++)
    {
      if (groupNumber == students.get(i).getGroupNumber())
        students1[i] = students.get(i);
    }
    return students1;
  }

  public Student[] getByNationality(String nationality)
  {
    int s = size();
    Student[] students1 = new Student[s];
    for (int i = 0; i < students.size(); i++)
    {
      if (nationality.equals(students.get(i).getNationality()))
        students1[i] = students.get(i);
    }
    return students1;
  }

  public Student[] getStudentsOlderThan(int years)
  {
    int s = size();
    Student[] students1 = new Student[s];
    for (int i = 0; i < students.size(); i++)
    {
      if (students.get(i).getAge() > years)
        students1[i] = students.get(i);
    }
    return students1;
  }

  public ArrayList<Integer> getAllGroupNumbers()
  {
    ArrayList<Integer> groupNumbers = new ArrayList<>();
    for (int i = 0; i < students.size(); i++)
    {
      groupNumbers.add(students.get(i).getGroupNumber());
    }
    return groupNumbers;
  }

  public ArrayList<String> getAllNationalities()
  {
    ArrayList<String> allnatio = new ArrayList<>();
    for (int i = 0; i < students.size(); i++)
    {
      allnatio.add(students.get(i).getNationality());
    }
    return allnatio;
  }

  @Override public String toString()
  {
    return "StudentList{" + "students=" + students + '}';
  }
}
