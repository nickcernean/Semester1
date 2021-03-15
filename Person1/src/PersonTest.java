import java.util.Scanner;
public class PersonTest
{
  public static void main(String[] args)
  { Scanner input=new Scanner(System.in);
    System.out.println("Input your name:");
    String name= input.nextLine();

    System.out.println("Input your age:");
    int age= input.nextInt();

    System.out.println("Input your gender:");
    input.nextLine();
    String line= input.nextLine();
    char gender=line.charAt(0);

    Person P1=new Person(name,age,gender);
    System.out.println("Person1:"+P1.toString());
    System.out.println("Name:"+P1.getName());
    System.out.println("Age:"+P1.getAge());
    System.out.println("Gender:"+P1.getGender());

    P1.setName("Alisa");
    System.out.println("New name:"+P1.getName());
    P1.setAge(56);
    System.out.println("New age:"+P1.getAge());
    P1.setGender('F');
    System.out.println("New gender:"+P1.getGender());
    System.out.println(P1.toString());
  }
}
