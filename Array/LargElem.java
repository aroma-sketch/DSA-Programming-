package Array;
import java.util.*;
import java.io.*;

// bubble sort
//time complexity is 0(n*n)
//ascending order

public class LargElem {
    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i,j;
    System.out.print("size:");
    int n =ob.nextInt();
    System.out.print("elem in array:");
    int a[]= new int[n];
    for( i=0;i<n;i++)
    {
        a[i]=ob.nextInt();
           
    }
     for(i=0;i<(n-1);i++)
     {
        for(j=0;j<(n-1-i);j++)
        {
            if(a[j]>a[j+1])
            {
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;

            }
        }
     }
     System.out.println("LARGEST ELEMENT="+a[n-1]);

     //display array
     for(i=0;i<n;i++)
     {
     System.out.println("Array:"+a[i]);
     
     }
}}
