package Pattern;
import java.util.Scanner;
public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int n = sc.nextInt();
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
