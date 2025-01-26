// 2. Find the Largest and second Largest element in an Array
public class largestElementInArray {
    public static int largestElement(int arr[]){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest) largest = arr[i];
        }
        return largest;
    }
    public static int secondLargest(int arr[]){
        int secondlargest = -1;
        int largest = largestElement(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=largest && arr[i]>secondlargest) secondlargest = arr[i];
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -56, 46, -23};
        System.out.println("The largest element in the array is "+largestElement(arr));
        System.out.println("The second-largest element in the array is "+secondLargest(arr));
    }
}
