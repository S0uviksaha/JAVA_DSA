// Reverse Array
package ARRAY_Q4;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = {2,4,7,9,3,-5,45,-78};
        int n = arr.length;
        System.out.println("Original Array : ");
        show(arr,n);
        System.out.println("Reversed Array : ");
        reverseArray(arr, n);
        show(arr, n);
    }

    public static void show(int arr[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int arr[], int n){
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}
