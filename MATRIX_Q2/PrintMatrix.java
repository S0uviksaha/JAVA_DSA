// Print elements Column-wise
package JAVA_DSA.MATRIX_Q2;

import java.util.Scanner;
public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows & columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter elements of Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of the Matrix Columnwise: ");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
