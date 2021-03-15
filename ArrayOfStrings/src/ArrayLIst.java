import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIst
{
  public static void main(String[] args)
  {
    int index = 0;
    //    String[] array;
    //    array = new String[8];
    ArrayList<String> array = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    for (int i = 0; i <5; i++)
    {
      System.out.println("Add  strings:");
      array.add(input.nextLine());
    }

    System.out.println("Type an index:");
    index = input.nextInt();
    for (int i = array.size()-1; i > index; i--)
    {
      array.set(i, array.get(i - 1));
    }
    System.out.println("Input new string:" + input.nextLine());
    array.set(index, input.nextLine());

    for (int i = 0; i < array.size(); i++)
    {
      System.out.println(array.get(i));
    }
    System.out.println(" toString (): " + array.toString());

  }
}
