// Maximum element in Array
package JAVA_DSA.ARRAY_Q2;

public class Max {
    public static void main(String[] args) {
        int arr[] = {4,-47,-3,96,-57,0};
        int max = Integer.MIN_VALUE;
        System.out.println("Elements of the Array are : ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Max element in the array is "+ max);
    }
}
