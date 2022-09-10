package Singly;

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

// Node insertAtBeginning(Node head, int x)
//     {
//            Node new_node = new Node(x);
//         // code here
//         if(head==null)
//         {
//             head=new_node;
//         }
//         else
//         {
//             new_node.next=head;
//             head=new_node;
//         }
//         return head;
//     }

//  //Function to insert a node at the end of the linked list.
//  Node insertAtEnd(Node head, int x)
//  {
//      // code here
//       Node new_node = new Node(x);
//      Node temp=head;
//       if (head == null) {
//              head = new_node;
//          }
//          else
//          {
//      while(temp.next!=null)
//      {
//          temp=temp.next;
//          }
//          temp.next=new_node;}
//            return head;
//  }