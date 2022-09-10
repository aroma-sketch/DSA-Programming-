package Singly;

import java.util.*;

// 

public class CheckElem  {

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



            if (head == null)
             {
                head = new_node;
            } 
            else 
            {
                new_node.next = head;
                head = new_node;
            }

            System.out.println("continue...?press 1 else anything");
            n = ob.nextInt();
        }
         while (n == 1);
         System.out.println("enter no");
         int x=ob.nextInt();
    }

    public void checkEl()
    {
        Scanner ob = new Scanner(System.in);

        System.out.println("enter no");
 int x=ob.nextInt();

        Node temp = head;

        if (head == null)
         {
            System.out.println("not exist");
        } 
        else 
        {
           while(temp!=null){
            
                if(temp.data ==x)
                System.out.println("present");
              
                else
                    System.out.println("not present");   
                temp = temp.next;
            }}
        
    }
 
//     public void traverse() {
//         Scanner ob = new Scanner(System.in);
//         System.out.println("enter no");
//  int x=ob.nextInt();
//         Node temp = head;
//         if (head == null) {
//             System.out.println("not exist");
//         } 
//         else 
//         {
//             while (temp != null) 
//             {
//                 temp = temp.next;
//             }
//         }
//     }

    public static void main(String[] args) {
        CheckElem i = new CheckElem();
        i.creation();
        i.checkEl();
        // i.traverse();
    }

}
