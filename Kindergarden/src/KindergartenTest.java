public class KindergartenTest
{
  public static void main(String[] args)
  {


    Kindergarten childs = new Kindergarten();
    childs.addChild(new Child("Nick", 5));
    childs.addChild(new Child("Ion", 7));
    childs.addChild(new Child("Anton", 3));
    childs.addChild(new Child("Ivan", 2));

    childs.celebrateBirthday("Ivan");
    childs.celebrateBirthday("Nick");
    childs.celebrateBirthday("Nick");
    childs.celebrateBirthday("Nick");

    System.out.println(childs.toString());
    //    System.out.println(childs.countChildren());
    //    childs.hireTeachers(4);
    //    System.out.println(childs.getNorm());
    //    System.out.println(childs.getAverageChildAge());
  }
}
