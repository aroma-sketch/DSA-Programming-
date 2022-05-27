package Recursion;
//  first index of elemrnt

import java.io.*;

import java.util.*;

public class search_elem {
    public static void main(String[] args) throws Exception{
        Scanner ob= new Scanner(System.in);
        System.out.println("enter no. of elem");
        int n = ob.nextInt();
        System.out.println("enter elem to be searched");
        int ele= ob.nextInt();

        int []a = new int[n];
        System.out.println("enter elems");
        for (int i = 0; i < n; i++)
        {
          a[i] = ob.nextInt();
        }
        int fi=search(a,0,ele);
        System.out.println("output="+fi);
    }
    public static int search(int[]arr, int idx, int ele)
    {
if(idx == arr.length){
    return -1;
}
if(arr[idx] ==ele){
    return idx;
}
int fiisa= search(arr,idx+1,ele);
return fiisa;
    }

}
