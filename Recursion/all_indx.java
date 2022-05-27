package Recursion;

// all index of an element and return nd storing in an array
import java.io.*;
import java.util.*;
public class all_indx {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no. of elem");
    int n =scn .nextInt();

    int[] arr = new int[n];
    System.out.println("enter elems");
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println("enter elem to be searched");
    int x = scn.nextInt();
    int[] iarr = allIndices(arr, x, 0, 0);

    if (iarr.length == 0) {
      System.out.println();
      return;
    }

    for (int i = 0; i < iarr.length; i++) {
      System.out.println("output="+iarr[i]);
    }
    
}
public static int[] allIndices(int[] arr, int x, int idx, int fsf)
{
if(idx == arr.length){
return new int[fsf];
}
if(arr[idx] ==x){
    int []iarr=allIndices(arr, x, idx+1, fsf+1);
    iarr[fsf]=idx;
return iarr;
}
int []iarr= allIndices(arr,x,idx+1,fsf);
return iarr;
}}
