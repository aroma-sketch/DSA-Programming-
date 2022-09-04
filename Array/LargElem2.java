package Array;
import java.util.*;


//SECOND LARGEST ELEMENT KIN AN ARRAY

public class LargElem2 {
    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i;
    
    //size of array
    System.out.print("size=");
     int n =ob.nextInt();

     //elements
    System.out.print("elem in array:");
    int a[]= new int[n];
    if(n<2)
    {
        System.out.println("No element found");
    }
    for( i=0;i<n;i++)
    {
        a[i]=ob.nextInt();
           
    }
    //algo

    int largest=0,second=0;
   
     for(i=0;i<n;i++)
     {
        if(largest<a[i])
        {
             second=largest;
            largest=a[i];

        }
         if(second<a[i] && largest!=a[i])
         {
            second=a[i];
         }
     }
     if (second == 0)
     {
        System.out.println("No element found"); 
     }
     else{
        System.out.println("second largest:"+second);
     }
    //  System.out.println("second largest:"+second);
    //  System.out.println(" largest:"+largest);
}
}

