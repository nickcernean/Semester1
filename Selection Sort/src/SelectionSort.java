import java.util.Scanner;

public class SelectionSort
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int[] elem = new int[10];

    System.out.println("Introduce array elements:");

    for (int i = 0; i < elem.length; i++)
    {
      System.out.println("Introduce " + (i + 1) + " element:");
      elem[i] = input.nextInt();
    }
    String str = "";

    for (int i = 0; i < elem.length; i++)
    {
      str += elem[i] + ", ";
    }
    System.out.println("All array elements:" + str);

    int smalNum = elem[0];
    int var = 0;
    for (int i = 0; i < elem.length; i++)
    {
      if (elem[i] < smalNum)
      {
        smalNum = elem[i];
        System.out.println("Smallest element:" + smalNum + ", It's index:" + i);
        var = i;
      }

    }

    String str1 = "";
    int var1 = 0;
    for (int i = 0; i < elem.length; i++)
    {
      var1 = elem[0];
      elem[0] = smalNum;
      if (i == var)
      {
        elem[i] = var1;
        str1 += elem[i] + ", ";
      }
      else
      {
        str1 += elem[i] + ", ";
      }
    }

    System.out.println("All array elements1:" + str1);

  }
}
