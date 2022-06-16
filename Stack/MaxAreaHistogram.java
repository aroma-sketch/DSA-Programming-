package Stack;

import java.util.Stack;
import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;


public class MaxAreaHistogram{
    static int arr[] = { 6, 2, 5, 4, 5, 1,6};
    static int n = arr.length;
    static  int left[] = new int[n];
        static  int right[] = new int[n];
            static  int width[] = new int[n];
                static  int area[] = new int[n];
                static  int max_area = 0;

    static void calculateMaxArea(int arr[], int n) {
      
        Stack<Integer> s = new Stack<>();
        //samllest right arr index 
        for (int i=0;i<n;i++) 
        {

            if (!s.empty()) 
            {
                while (!s.empty()&&s.peek()!=-1 && arr[s.peek()] >= arr[i])
                {
                     right[s.peek()]=(int) i;
                    s.pop();
                }
                right[i]=n;
            }
            s.push(i);
        }
        //smalest left arr index
        for (int i=arr.length-1;i>=0;i--)
        {
            if(!s.empty())
            {
                while (!s.empty() && arr[s.peek()] >=arr[i])
    
                {  left[s.peek()]=(int )i;
                    s.pop();
            }
            left[i]=-1;
            }
            s.push(i);
            }
            //width of the arr via =right-left-1;
            for(int i=0;i<n;i++)
            {
width[i]=right[i]-left[i]-1;
                area[i]=width[i]*arr[i];
                max_area=Math.max(max_area,area[i]);
            }
        }
//array printing
    // for(int i=0;i<n;i++)
     // System.out.println(left[i]+" ---> "+right[i]+"-->"+width[i]+" ==>> "+area[i]);
        // System.out.println  ("Maximum area of given histogram data is = "+max_area);
    // }

    // Driver method
    public static void main(String[] args) {
        calculateMaxArea(arr, n);
        System.out.println  ("Maximum area of given histogram is = "+max_area);
    }

}
