package Seção10.Matriz;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }

        }

        int number = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                if (number == mat[i][k]) {
                    System.out.println("Position " + i + ", " + k);

                    if (k > 0) {
                        System.out.println("Left: " + mat[i][k - 1]);
                    }

                    if (k < n - 1) {
                        System.out.println("Right: " + mat[i][k + 1]);
                    }

                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][k]);
                    }

                    if (i < m - 1) {
                        System.out.println("Down: " + mat[i + 1][k]);
                    }

                }
            }

        }
    }
}
