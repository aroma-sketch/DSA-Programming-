package Array;
import java.util.*;
import java.io.*;

// insertion sort
//time complexity is 0(n*n)
//ascending order
public class  InsertionSort{
    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i,j,k;
    System.out.print("size:");
    int n =ob.nextInt();
    //array
    System.out.print("elem in array:");
    int a[]= new int[n];
    for( i=0;i<n;i++)
    {
        a[i]=ob.nextInt();
           
    }
    //logic
    for(i=1;i<n;i++)
    {
       k=a[i];
       j=i-1;
       while(j>=0 &&a[j]>k)
           {
               a[j+1]=a[j];
               j=j-1;
           }
           a[j+1]=k;
       }
    
     //display array
     for(i=0;i<n;i++)
     {
        System.out.print("Array: ");  
     System.out.println(+a[i] + " ");
     }
}}

