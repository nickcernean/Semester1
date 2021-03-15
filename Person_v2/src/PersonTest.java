public class PersonTest
{
  public static void main(String[] args)
  {
    Person P1=new Person("Bob",'M');
    System.out.println("Person1:"+P1.toString());
    System.out.println("AgeStatus:"+P1.getAgeStatus());

   P1.setAge(-1);
    System.out.println("Person2:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(0);
    System.out.println("Person3:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(1);
    System.out.println("Person4:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(11);
    System.out.println("Person5:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(12);
    System.out.println("Person6:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(13);
    System.out.println("Person7:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(18);
    System.out.println("Person8:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(19);
    System.out.println("Person9:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(20);
    System.out.println("Person10:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(64);
    System.out.println("Person11:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(65);
    System.out.println("Person12:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());
    P1.setAge(66);
    System.out.println("Person13:"+P1.getAge());
    System.out.println("AgeStatus:"+P1.getAgeStatus());

  }
}
