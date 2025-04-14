// check if there exist any pair(i,j) for which arr[i] + arr[j] == k and i!= j
package JAVA_DSA.HASHMAP_Q3;

import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int arr[] = {1,2,6,4,5,8,12};
        int k = 12;
        System.out.println("Original Array: ");
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
        for (int i : hm.keySet()) {
            int j = k -i;
            if((i!=j || (i==j && hm.get(j)>1))&& hm.containsKey(j)==true){
                System.out.println(i+" + "+j+" = "+k);
                break;
            }
        }

    }
}
