import java.util.Scanner;

public class Clock1
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int count = 1;
    double sum = 1;
    double average = 1;
    for (int i = 0; i < count; i++)
    {
      count++;
      System.out.println("Enter number of seconds or -1 to end:");
      int value = input.nextInt();
      if (value < 0)
      {
        System.out.println("Please enter non-negative number or -1 to end:");
      }
      if (value == -1)
      {
        count = i;
      }
      sum += value;
    }
    average = sum / count;
    System.out.println("The total number of seconds is:" + sum);
    System.out.println("The average number of seconds is:" + average);

    Clock clock1 = new Clock((int) sum);
    System.out.println("The clock is:" + clock1);

  }
}
