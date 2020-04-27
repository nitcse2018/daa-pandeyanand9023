// Floyd Warshall Algorithm in Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Warshall {
  final static int INF = 999, nV = 4;

  void floydWarshall(int graph[][]) {
    int A[][] = new int[nV][nV];
    int i, j, k;

    for (i = 0; i < nV; i++)
      for (j = 0; j < nV; j++)
        A[i][j] = graph[i][j];

    for (k = 0; k < nV; k++) {
      for (i = 0; i < nV; i++) {
        for (j = 0; j < nV; j++) {
          if (A[i][k] + A[k][j] < A[i][j])
            A[i][j] = A[i][k] + A[k][j];
        }
      }
    }
    printMatrix(A);
  }

  void printMatrix(int A[][]) {
    for (int i = 0; i < nV; ++i) {
      for (int j = 0; j < nV; ++j) {
        if (A[i][j] == INF)
          System.out.print("INF ");
        else
          System.out.print(A[i][j] + "  ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int graph[][] = { { 0, 3, INF, 5 }, 
            { 2, 0, INF, 4 },
            { INF, 1, 0, INF },
            { INF, INF, 2, 0 } };
    Warshall a = new Warshall();
    a.floydWarshall(graph);
  }
}
