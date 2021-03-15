import java.util.ArrayList;

public class HomeHierarchyTest
{
  public static void main(String[] args)
  {
    Home home1 = new Apartment("Kamjatka 8", 3251);
    Home home2 = new Apartment("Kamjatka 8", 3251);
    Home home3 = new House("Kamjatka 8", 3251);
    Person person1 = new Person("Nicolae Cernean", home1);
    Person person2 = new Person("", home2);
    ArrayList<Person> people = new ArrayList<>();
    people.add(person1);
    people.add(person2);
    for (int i = 0; i < people.size(); i++)
    {
      System.out.println(people.get(i).getHomeInfo());
    }
    System.out.println(home1.equals(home2));
  }

}
