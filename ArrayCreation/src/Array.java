import java.util.Scanner;

public class Array
{
  public static void main(String[] args)
  {
    String[] array;
    array = new String[8];
    Scanner input = new Scanner(System.in);
    int index = 0;
    for (int i = 0; i < array.length - 1; i++)
    {
      System.out.println("Add 7 strings:");
      array[i] = input.nextLine();

    }
    System.out.println("Type an index:");
    index = input.nextInt();
    if (index >= 0 && index <= 7)
    {
      for (int i = array.length - 1; i > index; i--)
      {
        array[i] = array[i - 1];
      }
      System.out.println("Input new string:" + input.nextLine());
      array[index] = input.nextLine();
    }
    else
    {
      System.out.println("Wrong index");
    }

    for (int i = 0; i < array.length; i++)
    {
      System.out.println(array[i]);
    }

  }
}
