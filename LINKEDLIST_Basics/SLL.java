// Single Linked List 


public class SLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // insert new node at - first,last 
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty, nothing to delete");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty, nothing to delete");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            secondLast = lastNode;
            lastNode = lastNode.next;
        }

        secondLast.next = null;

    }

    // print
    public void printList(){
        Node currentNode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(currentNode.next != null){
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.deleteFirst();
        list.deleteLast();
        list.printList();
    }
}
