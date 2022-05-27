package Recursion;import java.io.*;


import java.util.*;

public class last_index {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter no. of elem");
    int n = scn.nextInt();
    int[] arr = new int[n];
    System.out.println("enter elems");
    for (int i = 0; i < n; i++) {
        
      arr[i] = scn.nextInt();
    }
    System.out.println("enter elem to be searched");
    int x = scn.nextInt();
     int li = lastIndex(arr, 0, x);
    System.out.println(li);
  }

  public static int lastIndex(int[] arr, int idx, int x) {
    if (idx == arr.length) {
      return -1;
    }

    int liisa = lastIndex(arr, idx + 1, x);
    if (liisa == -1) {
      if (arr[idx] == x) {
        return idx;
      } else {
        return -1;
      }}
      else {
        return liisa;
      }
    }
  }