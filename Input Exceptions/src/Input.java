import java.util.InputMismatchException;
import java.util.Scanner;

public class Input
{
  public static void main(String[] args) throws InputMismatchException
  {
    int[] arr = new int[5];
    Scanner input = new Scanner(System.in);
    System.out.println("Input 5 integers between 10-99:");
    int index =0;
    for (int i = 0; i < arr.length; i++)
    {
      do
      {
        try
        {
          System.out.println("Insert " + (i + 1) + " integer:");
          index = input.nextInt();

        }
        catch (InputMismatchException e)
        {
          e.printStackTrace();
          System.err.println("The input is not an integer between 10-99,try again" );
          input.nextLine();
        }
      }
      while (index < 10 || index > 99);
      arr[i] = index;
    }

    String s = "";
    for (int i = 0; i < arr.length; i++)
    {
      s += arr[i] + " ";
    }
    System.out.println("Values stored:" + s);
  }
}