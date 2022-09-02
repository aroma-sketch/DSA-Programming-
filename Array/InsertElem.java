
package Array;
import java.util.*;
import java.io.*;
 

// new loop b[]
public class InsertElem {
    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i;
    System.out.print("size:");
    int n =ob.nextInt();

    System.out.print("elem in array:");
    int a[]= new int[n];
    for( i=0;i<n;i++)
    {
        a[i]=ob.nextInt();
           
    }

    System.out.print("elem to be inserted:");
    int x=ob.nextInt();
    System.out.print("elem to be inserted at pos:");
    int pos=ob.nextInt();

    int b[]=new int[n+1];
    
     for(i=0;i<(n+1);i++)
     {
        if(i==pos){
            b[pos]=x;
        }
        else if(i<pos){

            b[i]=a[i];
        }
        else{
            b[i]=a[i-1];
        }
     }
     //display of array
     for(i=0;i<n+1;i++)
     {
     System.out.println("Array:"+b[i]);
     }
}}

