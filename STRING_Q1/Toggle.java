// Toggle elements of a String
package JAVA_DSA.STRING_Q1;

public class Toggle {
    public static void main(String[] args) {
        String str = "SoUviK SahA";
        char ch[] = str.toCharArray();
        System.out.print("Original String: ");
        System.out.println(ch);
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>=65 && ch[i]<=90){
                ch[i] = (char)(ch[i] + 32);
            }
            else if(ch[i]>=97 && ch[i]<=122){
                ch[i] = (char)(ch[i] - 32);
            }
        }
        System.out.print("String after toggle: ");
        System.out.println(ch);
    }
}
