package Array;
import java.util.*;
import java.io.*;

public class display {
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
     for(i=0;i<n;i++)
     {
     System.out.println("Array:"+a[i]);
     }
}}
