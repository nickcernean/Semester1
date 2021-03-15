public class BrainTest
{
  public static void main(String[] args)
  {

    Person person = new Person("Nicolae Cernean");

    person.learnATopic("drqeqeqeqeqeqeqweqweqeqeqeqeqweqeq");
    person.learnATopic("NIck nick ");
    person.learnATopic("dsadasdasdasdasdasdsadsadadaadadas");
    System.out.println( person.doYouRememberThisTopic("drqeqeqeqeqeqeqweqweqeqeqeqeqweqeq"));
    System.out.println(person.presentTopic(3));
    System.out.println(person.getIQ());
    System.out.println(person);

  }
}
