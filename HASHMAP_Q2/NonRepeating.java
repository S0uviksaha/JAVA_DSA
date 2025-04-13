// Print the first non repeating element in Array
package JAVA_DSA.HASHMAP_Q2;

import java.util.HashMap;
public class NonRepeating {
    public static void main(String[] args) {
        int arr[] = {1,2,1,4,7,9,6,4,13,-15};
        HashMap<Integer,Integer> hm = new HashMap<>();
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i+" ");
            if(hm.containsKey(i)==true){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        System.out.println();
        for (int i : arr) {
            if(hm.get(i)==1){
                System.out.println("First non repeating number in the Array is: "+ i);
                break;
            }
        }
    }
}
