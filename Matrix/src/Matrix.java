import java.util.Scanner;

public class Matrix
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Introdu marimea matrice-i A si B: ");
    int n = input.nextInt();

    int[][] matrixA = new int[n][n];
    int[][] matrixB = new int[n][n];
    int[][] matrixC = new int[n][2 * n];
//    int[][] matrixD = new int[2 * n][n];

    Scanner input2 = new Scanner(System.in);

    System.out.println("Introdu variabilele matricei A:");
    for (int i = 0; i < matrixA.length; i++)
    {
      for (int j = 0; j < matrixA[i].length; j++)
      {
        System.out.println("A" + i + "x" + j + "=");
        matrixA[i][j] = input2.nextInt();
      }
    }

    System.out.println("Introdu variabilele matricei B:");
    for (int i = 0; i < matrixB.length; i++)
    {
      for (int j = 0; j < matrixB[i].length; j++)
      {
        System.out.println("B" + i + "x" + j + "=");
        matrixB[i][j] = input2.nextInt();
      }
    }

    for (int i = 0; i < matrixC.length; i++)
    {
      for (int j = 0; j < matrixA.length; j++)
      {
        matrixC[i][j] = matrixA[i][j];
        matrixC[i][(j + matrixC[i].length) / 2] = matrixB[i][j];
      }
    }

//    for (int i = 0; i < matrixD[i].length; i++)
//    {
//      for (int j = 0; j < matrixA.length; j++)
//      {
//        matrixD[i][j] = matrixA[i][j];
//        matrixD[(j + matrixD.length) / 2][j] = matrixB[i][j];
//      }
//    }
//    int[][] matrixE = new int[n][n];
//    for (int i = 0; i < matrixE.length; i++)
//    {
//      for (int j = 0; j < matrixE[i].length; j++)
//      {
//        for (int k = 0; k < matrixD[i].length; k++)
//        {
//          matrixE[i][j] += matrixC[i][k] * matrixD[k][j];
//        }
//      }
//    }

    System.out.println("MatrixA");
    for (int i = 0; i < matrixA.length; i++)
    {
      for (int j = 0; j < matrixA[i].length; j++)
      {
        System.out.print(matrixA[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("Matrix B");
    for (int i = 0; i < matrixB.length; i++)
    {
      for (int j = 0; j < matrixB[i].length; j++)
      {
        System.out.print(matrixB[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("Matrix C");

    for (int i = 0; i < matrixC.length; i++)
    {
      for (int j = 0; j < matrixC[i].length; j++)
      {
        System.out.print(matrixC[i][j] + " ");
      }
      System.out.println();
    }

//    System.out.println("Matrix D");
//
//    for (int i = 0; i < matrixD.length; i++)
//    {
//      for (int j = 0; j < matrixD[i].length; j++)
//      {
//        System.out.print(matrixD[i][j] + " ");
//      }
//      System.out.println();
//    }
//    System.out.println("MatrixE: ");
//    for (int i = 0; i < matrixE.length; i++)
//    {
//      for (int j = 0; j < matrixE[i].length; j++)
//      {
//        System.out.print(matrixE[i][j] + " ");
//      }
//      System.out.println();
//    }

  }
}
