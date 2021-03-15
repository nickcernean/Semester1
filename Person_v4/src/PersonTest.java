public class PersonTest
{
  public static void main(String[] args)
  { Name name1=new Name("Nick","Cernean");
    Person person1=new Person(name1,'m');
person1.setGender('f');
person1.setAge(19);
System.out.println(person1);
    System.out.println("First name:"+person1.getName().getFirstName());
    System.out.println("First name:"+person1.getName().getFormalName());


  }
}
