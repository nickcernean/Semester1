public class Test
{
  public static void main(String[] args)
  {
    Name name1 = new Name("Nick", "Cernean");
    MyDate date1 = new MyDate(1, 2, 2000);
    Person person1 = new Person(name1, date1, 'm');
    System.out.println(person1.toString());
    Name name2 = new Name("Nick", "Cernean");
    MyDate date2 = new MyDate(1, 2, 2000);
    Person person2 = new Person(name2, date2, 'm');
    System.out.println(person2.getName().getFirstName());
    System.out.println( person1.equals(person2));

  }
}
