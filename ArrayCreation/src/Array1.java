import java.util.Arrays;
import java.util.Scanner;

public class Array1
{
  public static void main(String[] args)
  {
    String S [] = new String[8];
    Scanner input = new Scanner(System.in);
    int index =0;

    for (int i = 0; i <= 6  ; i++){
      System.out.print("Type something: ");
      S[i]= input.nextLine();

    }

    System.out.println("type and index: ");
    index = input.nextInt();

    input.nextLine();

    if (index >= 0 && index <= 7){
      for (int i = S.length-1; i > index; i--){
        S[i] = S[i-1];
      }
      System.out.println("type your String: ");
      S[index] = input.nextLine();

    } else {
      System.out.println("bad index");
    }



    System.out.println(Arrays.toString(S));


  }
}
