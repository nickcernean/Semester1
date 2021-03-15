public class Fibonacci
{
  public static void main(String[] args)
  {
    int n1 = 1;
    int n2 = 1;
    int n3 = 0;

    for (int i = 0; i < 20; i++)
    {
      if (n1 == 1 && n2 == 1)
      {
        System.out.println(n1);
        System.out.println(n2);
        n2++;
        System.out.println(n2);
      }
      n3 = n1 + n2;
      System.out.println(n3);
      if(n3<4182)
      { n1 = n2 + n3;
      System.out.println(n1);

      n2 = n3 + n1;
      System.out.println(n2);}
      else {System.out.println(n3);}
    }

  }

}

