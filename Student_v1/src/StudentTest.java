public class StudentTest
{
  public static void main(String[] args)
  { Student student1=new Student("BOB",null,21121);
    System.out.println(student1.toString());
    System.out.println(student1.hasAKnownNationality());
    Student student2=new Student("NIk","USA",21121);
    student2.setNationality("UK");
    System.out.println(student2);
    student2.setName("John");
    student2.setStudyNumber(12312);




  }
}
