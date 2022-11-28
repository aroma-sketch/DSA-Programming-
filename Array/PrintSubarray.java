package Array;

import java.util.*;

// print all the sub arrays
public class PrintSubarray {
    static void Sub_arrays(int a[], int n) {
        int i, j, k = 0;
        for (i = 0; i < n; i++) 
        {
            for (j = i; j < n; j++)
             {
                for (k = i; k <= j; k++)
                 {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) throws Exception {

        Scanner ob = new Scanner(System.in);
        int i;

        // size of array
        System.out.print("size=");
        int n = ob.nextInt();

        // elements
        System.out.print("elem in array:");
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = ob.nextInt();
        }
        Sub_arrays(a, n);

    }
}
