package Array.Sorting_Algo;
import java.util.*;

// recursive insertion sort 

public class RecInsertion {
  static int insertion_sort(int a[],int n){
    int i;
    for( i=0;i<n-1;i++)
    {
        for(int j=0;j<n-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
            int t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
    }
    }
    return a[i];
  }
    
    public static void main(String[] args) throws Exception{
        Scanner ob=new Scanner (System.in);
        int i;
        
        //size of array
        System.out.print("size=");
         int n =ob.nextInt();
    
         //elements
        System.out.print("elem in array:");
        int a[]= new int[n];
        
        for( i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
               
        }
insertion_sort(a,n);
for(i=0;i<n;i++)
{
System.out.println("Array:"+a[i]);
}
        
    }
}
