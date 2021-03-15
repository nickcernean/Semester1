public class PersonTest
{
  public static void main(String[] args)
  {
    Address address1 = new Address("Kamjatka 8", "Horsens");
    Address address2 = new Address("Lev Tolstoi", "Chisinau");

    House house1 = new House(address1, 3);
    House house2 = new House(address2, 3);

    Person person1 = new Person("Nicolae");
    person1.moveTo(house2);

    Person person2 = new Person("Joseph");
    person2.moveTo(house2);

    System.out.println(house1);
    System.out.println(person2.getTown());

    if (person1.getAddress().equals(person2.getAddress()))
    {
      System.out.println("True");
    }
    else System.out.println("False");
  }
}
