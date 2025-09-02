// Reverse a string
package STRING_Q2;

public class Rotate {
    public static void main(String[] args) {
        String name = "Sourav Pramanik";
        char ch[] = name.toCharArray();
        System.out.print("Original String: ");
        System.out.println(ch);
        int l = 0, r = ch.length-1;
        while(l<r){
            char temp =ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        System.out.print("Reversed String: ");
        System.out.println(ch);
    }
}
