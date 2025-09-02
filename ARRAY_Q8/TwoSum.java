package ARRAY_Q8;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int k = sc.nextInt();
        System.out.println("Original Array:");
        show(arr);
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==k){
                    System.out.println("Indices: "+i+" "+j);
                    System.out.println(arr[i]+" + "+arr[j]+" = "+k);
                    break;
                }
            }
        }
        sc.close();
    }

    public static void show(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
