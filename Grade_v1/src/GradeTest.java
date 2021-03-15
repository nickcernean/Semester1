public class GradeTest
{
  public static void main(String[] args)
  {
    Grade grade1 = new Grade(10);
    System.out.println("Danish to ects: " + grade1.toString());

    Grade grade2 = new Grade("Z");
    System.out.println("Get Danish grade: "+grade2.getGrade());

  }

}
