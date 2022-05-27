package Recursion;
 

import java.io.*;

import java.util.*;

public class max_no {

  public static void main(String[] args) throws Exception {

    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();

    int []a = new int[n];

    for (int i = 0; i < n; i++)
    {
      a[i] = ob.nextInt();
    }
    int max = maxOfArray(a, 0);
    System.out.println("max no. in an array :"+max);

  }

  public static int maxOfArray(int[] arr, int idx) {

    if (idx >= arr.length)
    {
      return Integer.MIN_VALUE;  //we have the constraint that the size of array will not be zero hence we have not considered that case here
    }

    int misa = maxOfArray(arr, idx + 1); //misa stands for maximum in smaller array

    if (arr[idx] > misa)
    {
      return arr[idx];
    }
    return misa;

  }

}