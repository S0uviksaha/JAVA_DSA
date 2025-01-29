// 4. Remove duplicates from Sorted Array

// import java.util.HashSet;

public class RemoveDupticates {
    public static int remove(int arr[]){

        /* Brute-Force
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int count = 0;
        for (Integer i : set) {
            arr[count++] = i;
        }
        */
        // Optimal 
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[j]!=arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,2,3,3,5};
        int k = remove(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
