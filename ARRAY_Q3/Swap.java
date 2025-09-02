// Swapping elements of Array
package ARRAY_Q3;

public class Swap {
    public static void main(String[] args) {
        int arr[] = {2,3};
        System.out.println("Array elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After Swapping Array elements are");
        swap(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int arr[]){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
