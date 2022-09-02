
package Array;
import java.util.*;
import java.io.*;
// largest element in an array
//time complexity is 0(n)
 
public class LargestElem {
    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i;
    System.out.print("size:");
    int n =ob.nextInt();

    System.out.print("elem in array:");
    int a[]= new int[10];
    for( i=0;i<n;i++)
    {
        a[i]=ob.nextInt();  
    }
    int max=a[0];
     for(i=0;i<n;i++)
     {
       if(a[i]>max)
       {
       max=a[i];
       }
      
     }
     System.out.println("number:"+max);
  
}
}

