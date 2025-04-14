// count no od distinct element in Array
package JAVA_DSA.HASHSET_Q1;

import java.util.HashSet;

public class DistinctElement {
    public static void main(String[] args) {
        int arr[] = {1,2,1,4,7,9,6,4,13,-15};
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i+" ");
            hs.add(i);
        }
        System.out.println();
        System.out.println("Distinct elemnts:");
        System.out.println(hs);
        System.out.println("No of distinct elements are "+ hs.size());
    }
}
