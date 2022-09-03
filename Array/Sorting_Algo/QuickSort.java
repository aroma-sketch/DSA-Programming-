package Array.Sorting_Algo;
import java.io.*;
import java.util.*;

 class  QuickSort
 {

 static int partition( int a[],int start,int end)
 {
int pivot=a[end];
int p=start;

for(int i=start;i<end-1;i++)
{
    if(a[i]<= pivot)
    {
        int t=a[p];
        a[p]=a[i];
        a[i]=t;
        p++;
        
    }
}

    int t=a[p];
    a[p]=a[end];
    a[end]=t;
return p;
 }
 
// algorithm
  static void quicksort(int a[],int start,int end)
{
    if(start<end)
    {
      int  p= partition(a,start,end);
        quicksort(a,start,p-1);
        quicksort(a, p+1,end);
       
    }
}

    public static void main(String args[])
{
    Scanner scn=new Scanner (System.in);
        int i;

        System.out.print("size:");
        int n =scn.nextInt();

        // input array
        System.out.print("elem in array:");
        int a[]= new int[n];
        for( i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
               
        }

        QuickSort q1=new QuickSort();
       q1.quicksort(a,0,n-1);

       //display
        for(i=0;i<n;i++)
        {
            System.out.println("Array:="+a[i]+" ");
        }

}}