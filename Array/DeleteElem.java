package Array;
import java.util.*;
import java.io.*;
 

// new loop b[]
public class DeleteElem {
    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i;
    System.out.print("size:");
    int n =ob.nextInt();

    System.out.print("elem in array:");
    int a[]= new int[n];
    for( i=0;i<n;i++)
    {
        a[i]=ob.nextInt();
           
    }

    System.out.print("elem to be deleted:");
    int x=ob.nextInt();
   

    int b[]=new int[n-1];
    
     for(i=0;i<(n-1);i++)
     {
       if(a[i]==x)
       
            continue;
        else {
            while(a[i]!=x)
            {
                b[i]=a[i+1];
            }
            
        }
        // if(a[i]==x){
        //     continue;
        // }
        //  else if(a[i]){

        //     b[i]=a[i];
        //  }
        // else{
        //     b[i]=a[i-1];
        // }
     }
     //display of array
     for(i=0;i<n;i++)
     {
     System.out.println("Array:"+b[i]);
     }
}}

