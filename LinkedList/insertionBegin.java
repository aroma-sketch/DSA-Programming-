
import java.util.*;
//insertion at begining 

public class insertionBegin {

    // structure of node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        int n;
        Scanner ob = new Scanner(System.in);
        do {
            System.out.println("enter data");
            int data = ob.nextInt();

            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }

            System.out.println("continue...?press 1 else anything");
            n = ob.nextInt();
        } while (n == 1);
    }

    public void traverse() {

        Node temp = head;
        if (head == null) {
            System.out.println("not exist");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        insertionBegin i = new insertionBegin();
        i.creation();
        i.traverse();
    }

}
