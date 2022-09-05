package Array;
import java.util.*;

// rotating array with user input shift pointer
public class RotateD {
    static void sorted_array(int a[],int n,int c)
    {
       int i; 
       int b[]= new int[n];
    
        for( i=0;i<n-c; i++)
        {
           b[i]=a[i+c];
           
        }
        for(i=n-c;i<n;i++)
        {
    
       b[i]=a[i-n+c];
        }
        System.out.println("Sorted array:");
        for( i=0;i<n;i++)
        {
        System.out.print(b[i]+" ");
        }
    }
       public static void main(String[] args) throws Exception 
       {
    
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
       System.out.print("counter");
       int c =ob.nextInt();
    
    sorted_array(a, n,c);
    
       }
    
}
