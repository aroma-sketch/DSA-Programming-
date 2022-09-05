 package Array;
 import java.util.*;

 //check if array is sorted !!

 class  RemoveDuplicate
{
    static int sorted_array(int a[],int n)
{
    int i=0; 
    int k=0;

    int b[]= new int[n];


     for( i=0 ;i<n-1; i++)
     {
        if(a[i] != a[i+1] )
          b[k++]=a[i];
     }
    b[k++]=a[n-1];

    for( i=0;i<k;i++)
    {
    a[i]=b[i];
    }
    return k;
    
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

n=sorted_array(a, n);
System.out.println("Sorted array:");
    for( i=0;i<n;i++)
    {
    System.out.print(a[i]+" ");
}
    }

}


