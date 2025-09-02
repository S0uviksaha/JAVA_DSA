package ARRAY_Q5;

public class PartialReverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Original Array : ");
        show(arr);
        // rotation will be from start to stop index
        int start = 2;
        int stop = 4;
        rotate(arr, start, stop);
        System.out.println("Array after partial rotation(rotation from index " + start + " to index " + stop + "): ");
        show(arr);
    }

    public static void show(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void rotate(int arr[], int start, int stop){
        while(start<stop && start!=stop){
            int temp = arr[start];
            arr[start] = arr[stop];
            arr[stop] = temp;
            start++;
            stop--;
        }
    }
}
