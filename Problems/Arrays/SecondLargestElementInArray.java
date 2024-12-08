package Problems.Arrays;

import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no of elements in Array :");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements of Array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Original Array is");
            printArray(arr,n);
            secondLargest(arr,n); //Optimal Solution
        }
    }
    static void printArray(int arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void secondLargest(int arr[],int n){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if((arr[i]!=largest) && (arr[i]>largest)){
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("Second Largest element in the Array is "+ secondLargest);
    }
}
