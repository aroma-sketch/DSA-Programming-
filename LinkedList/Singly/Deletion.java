package Singly;

import java.util.*;
//Deletion in linkedList 

public class Deletion {

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
            }
             else 
             {
                System.out.println("1-at begin,2- at end,3- at specific");
             int  m = ob.nextInt();
             switch(m)
             {
                case 1:  // insertion at begining
                new_node.next = head;
                head = new_node;
                break;

                case 2:  // insertion at end
                Node temp = head;
             
                    while (temp.next!= null) 
                    {
                        temp = temp.next;
                    }
                    temp.next=new_node;

             
                break;

                case 3:   //insertion at specific position
                System.out.println("enter pos");
                int pos=ob.nextInt();
                Node temp1 = head;
                    for (int j=0;j<pos-1;j++)
                    {
                        temp1 = temp1.next;
                    }
                    new_node.next=temp1.next;
                    temp1.next=new_node;
                break;
             } }

            System.out.println("continue...?press 1 else anything");
            n = ob.nextInt();
        }
         while (n == 1);
    }

    
    public void creation_delete() {
        int n;
        Scanner ob = new Scanner(System.in);
        do {
   if (head == null)
    {
        System.out.println("ll is empty");
            }
             else 
             {
                System.out.println("1-delete at begin,2-delete at end,3-delete at specific");
             int  m = ob.nextInt();
             switch(m)
             {
                case 1:  // Deletion at begining
                Node temp2=head;
              temp2=temp2.next;
              head=temp2;
                break;

                case 2:  // Deletion at end
                Node temp = head;
                Node pointer= temp.next;
             
                    while (pointer.next!= null) 
                    {
                        temp = pointer;
                        pointer=pointer.next;
                    }
                    temp.next=null;

             
                break;

                case 3:   //Deletion at specific position
                System.out.println("enter pos");
                int pos=ob.nextInt();
                Node temp1 = head;
                Node point= temp1.next;

                    for (int j=0;j<pos-1;j++)
                    {
                        point=point.next;
                        temp1 = point;
                    }
               
                    temp1.next=point.next;
                break;
default:
             }
               
            }

            System.out.println("continue...?press 1 else anything");
            n = ob.nextInt();
        }
         while (n == 1);
    }

//traversing to all data
    public void traverse() {

        Node temp = head;
        if (head == null) 
        {
            System.out.println("not exist");
        } 
        else
         {
            while (temp != null)
             {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Deletion d = new Deletion();
        d.creation();
       // d.traverse();
        d.creation_delete();
        d.traverse();

    }

}
