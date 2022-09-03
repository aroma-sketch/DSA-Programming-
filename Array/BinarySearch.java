package Array;
import java.io.*;
import java.util.*;

 class  BinarySearch
 {
   int search( int a[],int start,int end,int ele)
{
    if(end>=start)
    {
        int mid=start+(end-start)/2;

        if(a[mid]==ele)
      return mid;

     if(a[mid]>ele)
      return search(a,start,mid-1,ele);

      
      return search(a,mid+1,end,ele);

}
return -1;
}
    public static void main(String args[])
{
    Scanner ob=new Scanner (System.in);
        int i;
        System.out.print("size:");
        int n =ob.nextInt();

        // input array
        System.out.print("elem in array:");
        int a[]= new int[n];
        for( i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
               
        }
        System.out.print("element to be searched:");
        int ele =ob.nextInt();


        BinarySearch b=new BinarySearch();
      int res=b.search(a,0,n-1,ele);
if( res== -1){
    System.out.print("element not present !");
}
else{
    System.out.print("present at=="+res);
}
}}