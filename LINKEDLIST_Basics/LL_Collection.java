import java.util.LinkedList;
public class LL_Collection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("null");

        list.removeLast();
        list.removeFirst();

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("null");

    }
}
