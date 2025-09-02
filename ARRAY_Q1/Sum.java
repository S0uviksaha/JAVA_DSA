// Sum of Array Elements
package ARRAY_Q1;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        // input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no of elements in array1 : ");
        int n = scn.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter elements of array1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        int[] arr2 = {1,2,3,4,5,6};
        int sum1=0, sum2=0;

        // output
        for (int i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 = sum2 + arr2[i];
        }
        System.out.println("Sum of elements of Array1 is "+ sum1);
        System.out.println("Sum of elements of Array2 is "+ sum2);

        scn.close();
    }
}

