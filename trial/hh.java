
package trial;
import java.util.*;
import java.io.*;

public class hh {
    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i;
    System.out.print("size:");
    int n =ob.nextInt();
   
    int a[]= new int[n];
     for( i=0;i<n;i++)
     {
         a[i]=ob.nextInt();
        
     }
     int c=0;
    
     for( i=0;i<n-1;i++)
     {
        
     if(a[i]%6==0)
     {
        c++;
     }}
     System.out.println("hjdj"+c);
     for(i=0;i<n;i++)
     {
     System.out.println("Array:"+a[i]);

     }
}}
