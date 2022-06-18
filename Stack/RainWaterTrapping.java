package Stack;
import java.util.*;
import java.lang.*;
import java.io.*;

public class RainWaterTrapping {
    static int arr[] = { 0,1,0,2,1,0,1,3,2,1,2,1};
    static int n = arr.length;
    static  int max_left[] = new int[n];
        static  int max_right[] = new int[n];
        static int min_no[]=new int[n];
            static  int water[] = new int[n];
             
             
                static  int max_water = 0;
               

    static void calc_water(int arr[], int n) {

        //smallest right arr index 
        max_right[n-1]=arr[n-1];
                max_left[0]=arr[0];
 for (int i=1;i<n;i++) 
 {
max_left[i]=Math.max(max_left[i-1],arr[i]);
     
 }
 for (int i=n-2;i>=0;i--)
 {
max_right[i]=Math.max(max_right[i+1],arr[i]);
 }
  for(int i=0;i<n;i++){
      min_no[i]=Math.min(max_left[i],max_right[i]);
      water[i]=min_no[i]-arr[i];
      max_water=max_water+water[i];
  }
//array printing
//  for(int i=0;i<n;i++){
//     System.out.println(max_left[i]+"->"+max_right[i]+"-->"+min_no[i]+"-->"+water[i]);
  
//  }
    }
       

    // Driver method
    public static void main(String[] args) {
        calc_water(arr, n);
        System.out.println  ("Maximum area of water  is = "+max_water);
    }

}

