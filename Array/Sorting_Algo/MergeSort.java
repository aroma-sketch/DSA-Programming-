package Array.Sorting_Algo;
import java.io.*;
import java.util.*;

 class MergeSort 
 {
 void merge1( int a[],int start,int mid,int end)
 {

    //left subarray , right sub array
    int l=mid-start+1;
    int r=end-mid;
    int left_arr[]= new int[l];
    int right_arr[]=new int [r];

    for(int i=0;i<l;i++)
    left_arr[i]=a[start+i];
    for(int j=0;j<r;j++)
    right_arr[j]=a[mid+1+j];

    //
//l=4 ,r=4,
    int i=0,j=0;
    int k=start;
    while(i<l && j<r)
    {
        if(left_arr[i]<=right_arr[j])
            {
                a[k]=left_arr[i];
                i++;
            }
        else{
            a[k]=right_arr[j];
            j++;
            }
        k++;

    }
    while(i<l){
        a[k]=left_arr[i];
        i++;
        k++;
    }
    while(j<r){
        a[k]=right_arr[j];
        j++;
        k++;
    }
 }

 void mergesort(int a[],int start,int end)
{
    if(start<end){
        int mid=start + (end-start)/2;
        mergesort(a,start,mid);
        mergesort(a, mid+1,end);
        merge1(a,start,mid,end);
    }
}
    public static void main(String args[])
{
    Scanner scn=new Scanner (System.in);
        int i,j,k;
        System.out.print("size:");
        int n =scn.nextInt();
        //array
        System.out.print("elem in array:");
        int a[]= new int[n];
        for( i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
               
        }
        MergeSort ob = new MergeSort();
        ob.mergesort(a,0,n-1);
        for(i=0;i<n;i++)
        {
            System.out.println("Array:="+a[i]+" ");
        }

}}