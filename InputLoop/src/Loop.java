import java.util.Scanner;

public class Loop
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int count = 5;
    int sum = 0;
    for (int i = 0; i < count; i++)
    {
      System.out.println("Type an integer:");
      int value = input.nextInt();
      sum += value;
    }
    System.out.println("The sum is " + sum);
  }

}
