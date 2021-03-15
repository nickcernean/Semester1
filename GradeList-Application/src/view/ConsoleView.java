package view;

import model1.Grade;
import model1.GradeListModel;

import java.util.Scanner;

public class ConsoleView
{
  private GradeListModel gradeListModel;

  public ConsoleView(GradeListModel model)
  {
    this.gradeListModel = model;
  }

  public void start()
  {
    Scanner input = new Scanner(System.in);
    boolean running = true;
    while (running)
    {
      System.out.println("1) Add a Grade");
      System.out.println("2) Remove a Grade");
      System.out.println("3) Get a Grade");
      System.out.println("4) Get number of grades");
      System.out.println("5) Get Max Grade");
      System.out.println("6) Get Min Grade");
      System.out.println("7) Get Average");
      System.out.println("8) Get all grades");
      System.out.println("0) QUIT");

      System.out.println("\n Enter choice:");
      int choice = input.nextInt();

      switch (choice)
      {
        case 1:
          System.out.println("Add a grade:");
          int grade1=input.nextInt();
          input.nextLine();
          System.out.println("enter course name:");
          String course=input.nextLine();
          Grade grade = new Grade(grade1, course);
          gradeListModel.addGrade(grade);

          break;
        case 2:
          System.out.println("Remove a grade:");
          gradeListModel.removeGrade(input.nextInt());
          input.nextLine();
          break;
        case 3:
          System.out.println("Get a grade:");
          gradeListModel.getGrade(input.nextInt());
          input.nextLine();
          break;
        case 4:
          System.out.println("Get number of grades:");
          gradeListModel.numberOfGrades();
          input.nextLine();
          break;
        case 5:
          System.out.println("Get Max grade:");
          gradeListModel.getMaxGrade();
          input.nextLine();
          break;
        case 6:
          System.out.println("Get Min grade:");
          gradeListModel.getMinGrade();
          input.nextLine();
          break;
        case 7:
          System.out.println("Get average:");
          gradeListModel.getAverage();
          input.nextLine();
          break;
        case 8:
          System.out.println("Get all grades:");
          gradeListModel.getAll();
          input.nextLine();
          break;
        case 0:
          running = false;
          break;
      }

    }

  }

}
