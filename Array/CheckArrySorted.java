
package Array;
import java.util.*;

//check if array is sorted !!

public class CheckArrySorted {

    static boolean sorted_array(int a[],int n)
{
     for(int i=1;i<n;i++)
     {
        if(a[i-1]>a[i] )
           return false;
      
    }
    return true;
  
}
    public static void main(String[] args) throws Exception {

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

    if(sorted_array(a,n))
    System.out.print("YESSSS:");
    else
    System.out.print("NOO:");
    //algo

}

}

