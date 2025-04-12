// Rotate Array
package JAVA_DSA.ARRAY_Q6;
import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations:");
        int k = sc.nextInt();
        k = k % n; // to handle k > n 

        System.out.println("Original Array:");
        show(arr);
        // Rotate the array
        rotate(arr,0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);
        System.out.println("Rotated Array:");
        show(arr);
        sc.close();
    }

    public static void show(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void rotate(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
