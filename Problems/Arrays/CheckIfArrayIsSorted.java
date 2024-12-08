package Problems.Arrays;
import java.util.Scanner;
public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no of elements in Array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements of Array : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            printArray(arr, n);
            System.out.print("Array is sorted : " + isSorted(arr, n));
        }
    }
    public static void printArray(int arr[], int n){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static boolean isSorted(int arr[],int n) {
        for (int i = 0; i < n -1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
