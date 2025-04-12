package JAVA_DSA.HASHMAP_Q1;

import java.util.HashMap;

public class FindFrequency {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,1,2,3,8};
        int query[] = {1,2,3,9};
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("Query Array: ");
        printArray(query);
        System.out.println("Frequencies of the elements of Query Array: ");
        Printfrequency(arr,query);
    }

    public static void Printfrequency(int arr1[], int arr2[]){
        HashMap <Integer,Integer> hm = new HashMap<>();
        for (int i : arr1) {
            if(hm.containsKey(i)==true){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        for(int val : arr2){
            if(hm.containsKey(val)==true){
                System.out.println(val+" : "+hm.get(val));
            }
            else{
                System.out.println(val+" : "+0);
            }
        }
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
