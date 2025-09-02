// Print elements in Wave-form pattern
package MATRIX_Q3;

public class WaveForm {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,4},{5,6}};
        System.out.println("Elements of a Matrix in Wave form");
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){       // left to right
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{             // right to left
                for (int j = arr[0].length -1; j>=0; j--) {    
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
