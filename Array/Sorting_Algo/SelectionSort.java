package Array.Sorting_Algo;
import java.util.*;
import java.io.*;
//time complexity os 0(n*n)
//ascending order
public class SelectionSort{
    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i,j,min,pos;
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
        min=a[i];
        pos=i;
        for(j=i+1;j<n;j++)
        {
            if(min>a[j])
            {
                min=a[j];
                pos=j;
            }
        }
               int t=a[i];
                a[i]=a[pos];
                a[pos]=t;
     }
     //display array
     for(i=0;i<n;i++)
     {
     System.out.println("Array:"+a[i]);
     }
}}
