public class PersonTest
{
  public static void main(String[] args)
  {
    Person[] persons = new Person[4];
    try
    {
      persons[0] = new Person(new Name("sasa", "Nicolae"), new MyDate(),'m');
      persons[1] = new Person(new Name("Ion", "Andrei"), new MyDate(1, 1, 1997), 'm');
      persons[2] = new Person(new Name("Stan", "njkhi"), new MyDate(11, 29, 2000), 'f');
      persons[3] = new Person(new Name("Cernean", "Viorel"), new MyDate(11, 29, 2000), 'f');

    }
    catch (IllegalArgumentException e)
    {
      System.out.println("Exception:" + e.getMessage());
      e.printStackTrace();
    }
    System.out.println(persons[0].getBirthday());




  }
}


