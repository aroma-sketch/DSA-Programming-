
package Array;
import java.util.*;

//left rotating the array !!

class  LeftRotate{
   static void sorted_array(int a[],int n)
{
   int i; 
   int b[]= new int[n];


    for( i=1 ;i<n; i++)
    {
       b[i-1]=a[i];
       
    }
    b[n-1]=a[0];
    
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

    //new array variable
    int b[]= new int[n];

    //elements
   System.out.print("elem in array:");
   int a[]= new int[n];
   
   for( i=0;i<n;i++)
   {
       a[i]=ob.nextInt();
          
   }
sorted_array(a, n);

//    for( i=0;i<n;i++)
//    {
//    System.out.print(a[i]+" ");
// }
   }

}


