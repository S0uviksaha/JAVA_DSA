//  3. Check if an Array is Sorted 
public class CheckforSorting {
    public static boolean check(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>arr[(i+1)%n]) count++;
        }
        if(count>1) return false;
        return true;
    }
    public static void main(String[] args) {
        int arr[] = { 5, 6, 4, 1, 2};
        if(check(arr)==true)    System.out.println("Array is Sorted");
        else    System.out.println("Array is not Sorted");
    }
}