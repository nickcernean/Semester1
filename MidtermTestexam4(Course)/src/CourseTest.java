import java.util.Arrays;

public class CourseTest
{
  public static void main(String[] args)
  {
    Instructor prymaryInstructor = new Instructor("Richard Brooks\n", 402);
    Instructor secondaryInstructor = new Instructor("Steffen Visen\n", 405);



    Course course=new Course("Math",prymaryInstructor);
    course.setSecondaryInstructor(secondaryInstructor);

    course.addStudent(new Student("Stan Felix", 1));
    course.addStudent(new Student("Nick Cernean", 4));
    course.addStudent(new Student("Rokas Paulaskas", 6));
    course.addStudent(new Student("Joseph Vindelsen", 7));
    course.addStudent(new Student("Alexandru Ionescu", 2));
    course.addStudent(new Student("Florin Plaesu", 2));
    course.addStudent(new Student("Maria Cristina", 3));

    System.out.println("Primary Instructor:"+course.getPrimaryInstructor());
    System.out.println("Secondary instructor:"+course.getSecondaryInstructor());
    System.out.println("Number of instructors:"+course.getNumberOfInstructors());
    System.out.println("No of student by sem:"+course.getNumberOfStudents(2));
    System.out.println(" Students by sem:"+ Arrays.toString(course.getStudentsBySemester(2)));
    System.out.println(course.hasStudent("Florin Plaesu"));






//    Course[] list2 =new Course[c]
//    for (int i = 0; i <courses.length;i++ )
//    {
//      if (list2[i].getSemester() == 3 )
//      {
//        System.out.println(list2[i]);
//      }
//
//      else
//        System.out.println("Esti prost");
//    }


  }
}
