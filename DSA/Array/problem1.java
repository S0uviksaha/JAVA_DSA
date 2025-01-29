// 1. Take Array as input from user. Search for a given number X and print the index at which it occurs.
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of Array : ");
            int n = sc.nextInt();
            int nums[] = new int[n];
            System.out.println("Enter elements of the Array :");
            for(int i=0; i<n; i++){
                nums[i] = sc.nextInt();
            }
            System.out.print("Enter the number which have to be searched : ");
            int key = sc.nextInt();
            int index = -1;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]==key) index = i;
            }
            if(index != -1) System.out.println("Number "+key+" found at index = "+index);
            else System.out.println("The number is not found in the Array");
        }
    }
}