
package Array;
import java.util.*;
// without taking extra loop in same array

public class InsertElem2 {
    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i;
    int n=10;
    System.out.print("size:");
     int size =ob.nextInt();

    System.out.print("elem in array:");
    int a[]= new int[n];
    for( i=0;i<size;i++)
    {
        a[i]=ob.nextInt();
           
    }

    System.out.print("elem to be inserted:");
    int x=ob.nextInt();
    System.out.print("elem to be inserted at pos:");
    int pos=ob.nextInt();
    
     for(i=(size+1);i>pos;i--)
     {
       a[i]=a[i-1];
     
     }
     a[pos]=x;
     //display of array
     for(i=0;i<(size+1);i++)
     {
     System.out.println("Array:"+a[i]);
     }
}
}

