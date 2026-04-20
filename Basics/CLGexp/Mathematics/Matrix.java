package Mathematics;

import java.util.Scanner;

public class Matrix {   // MUST be public to import

    int rows, cols;
    int[][] mat;

   public  Matrix(int r, int c) {
        rows = r;
        cols = c;
        mat = new int[rows][cols];
    }

    public void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix m2) {
        Matrix res = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res.mat[i][j] = this.mat[i][j] + m2.mat[i][j];
            }
        }
        return res;
    }

    public Matrix subtract(Matrix m2) {
        Matrix res = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res.mat[i][j] = this.mat[i][j] - m2.mat[i][j];
            }
        }
        return res;
    }
}
