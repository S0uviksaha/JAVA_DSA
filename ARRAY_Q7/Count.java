// Count total no of elements havaing at least 1 element greater than itself in the array
package ARRAY_Q7;

public class Count {
    public static void main(String[] args) {
        int arr[] = {1, 3, -4, 11, 6, 11, 7, 11, -5, 9};
        int max = arr[0], count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                count++;
            }
        }
        System.out.println("Original Array:");
        show(arr);
        System.out.println("Total no of elements having at least 1 element greater than itself in the array: "+count);
    }

    public static void show(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
