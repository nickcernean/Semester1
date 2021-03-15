import java.util.Scanner;
public class EngineTest
{ public static void main(String[] args)
    { Scanner input=new Scanner(System.in);
       System.out.println("Input the engine type:");
       String type=input.nextLine();
      System.out.println("Input the engine horse power:");
      int horsePower=input.nextInt();
      System.out.println("Input the engine volume:");
      int volume=input.nextInt();
      System.out.println("Diesel or not:");
      boolean isDiesel=input.nextBoolean();
      Engine engine1=new Engine(type,horsePower,volume,isDiesel);
        System.out.println("Engine:"+engine1.toString());
    }
}
