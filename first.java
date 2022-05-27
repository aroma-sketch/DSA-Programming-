import java.io.*;

import java.util.*;
public class first {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printDecreasing(n);
  } 
  public static void printDecreasing(int n) {
    //Base case
    if (n == 0)
      return;

    //Self Work
    System.out.println(n);

    //Recursive call
    printDecreasing(n - 1);
  }
}


