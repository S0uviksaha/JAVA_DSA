package Problems.Arrays;
import java.util.Scanner;
public class LargestElementInArray {
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
            largest(arr,n); //Optimal Solution
        }
    }
    static void printArray(int arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void largest(int arr[],int n){
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element in the Array is "+ largest);
    }
}
