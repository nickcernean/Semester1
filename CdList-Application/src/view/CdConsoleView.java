package view;

import model.Cd;
import model.CdModel;
import model.Song;

import java.util.Scanner;

public class CdConsoleView
{
  private CdModel cdModel;

  public CdConsoleView(CdModel model)
  {
    this.cdModel = model;
  }

  public void start()
  {
    Scanner input = new Scanner(System.in);
    boolean running=true;
    while (running)
    {
      System.out.println("1) Get a CD");
      System.out.println("2) Get CD by it's title ");
      System.out.println("3) Get number of CD's");
      System.out.println("4) Add a CD");
      System.out.println("5) Remove First CD by Title");
      System.out.println("0) QUIT");

      System.out.println("\n Enter choice:");
      int choice = input.nextInt();

      switch (choice)
      {
        case 1:
          System.out.println("Get a CD from CdList:");
          int cd = input.nextInt();
          input.nextLine();
          cdModel.getCd(cd);
          break;

        case 2:
          System.out.println("Get a CD from CdList by it's title:");
          String title = input.nextLine();
          input.nextLine();
          cdModel.getCdsByTitle(title);
          break;
        case 3:
          System.out.println("Get number of CD's:");
          cdModel.getNumberOfCds();
          input.nextLine();
          break;
        case 4:
          System.out.println("This is not implemented");
          break;
        case 5:
          System.out.println("Remove first song by title:");
          String titleRemove = input.nextLine();
          input.nextLine();
          cdModel.removeFirstCdByTitle(titleRemove);
          break;
        case 0:
            running=false;
            break;

      }

    }
  }
}
