import java.util.Arrays;

public class StudentListTest
{
  public static void main(String[] args)
  {
    Student[] students = new Student[4];
    students[0] = new Student("Nick", "MD", 1234, 2, new MyDate(11, 29, 2000));
    students[1] = new Student("Ion", "US", 5678, 3, new MyDate(10, 29, 2001));
    students[2] = new Student("Andrei", "Uk", 1234, 4,
        new MyDate(12, 29, 2005));
    students[3] = new Student("Viorel", "MD", 1234, 2, new MyDate(2, 3, 1978));

    StudentList studentList = new StudentList();

    studentList.addStudent(students[0]);
    studentList.addStudent(students[1]);
    studentList.addStudent(students[2]);
    studentList.addStudent(students[3]);
    studentList.removeStudent(2);

    System.out.println(studentList.get(2));
    System.out.println(studentList.getByStudyNumber(1234));
    System.out.println(studentList.getNumberOfGroupMembers(3));
    System.out.println(studentList.getAllNationalities());
    System.out.println(studentList.getAllGroupNumbers());
    System.out.println("get By studynumber:"+studentList.getByStudyNumber(1234));
    System.out.println("Get by nationality:"+ Arrays.toString(studentList.getByNationality("MD")));
    System.out.println(Arrays.toString(studentList.getStudentsOlderThan(16)));

  StudentList studentList1=new StudentList(students);
    System.out.println(studentList1);


  }

}
