package Array;
import java.util.*;
// without taking extra loop in same array

public class DeleteElem2 {
    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i,temp=0;
    int n=10;
    System.out.print("size:");
     int size =ob.nextInt();

    System.out.print("elem in array:");
    int a[]= new int[n];
    for( i=0;i<size;i++)
    {
        a[i]=ob.nextInt();
           
    }

    System.out.print("elem to be deleted:");
    int x=ob.nextInt();
   
     for(i=0;i<size+1;i++)
     {
        if(a[i]==x)
         {
            a[i]=a[i+1];
            temp=i+1;
            break;

         } 
       
     }
   
     for(i=temp;i<(size-1);i++)
     {
        a[i]=a[i+1];
     }
     //display of array
     for(i=0;i<(size-1);i++)
     {
     System.out.println("Array:"+a[i]);
     }
}
}

