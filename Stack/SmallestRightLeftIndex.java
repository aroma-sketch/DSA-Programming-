package Stack;
 
import java.util.Stack;
import java.util.Arrays;

public class SmallestRightLeftIndex {
    static int arr[] = { 6, 2, 5, 4, 5, 1,6};
    static int n = arr.length;
    static  int left[] = new int[n];
        static  int right[] = new int[n];
            static  int width[] = new int[n];
                static  int area[] = new int[n];

    static void calculateSpan(int arr[], int n, int left[],int right[],int width[],int area[]) {
      
        Stack<Integer> s = new Stack<>();
        
    // left[i]=n;
    // right[i]=-1;

        for (int i=0;i<n;i++) {

            if (!s.empty()) 
            {
                while (!s.empty()&&s.peek()!=-1 && arr[s.peek()] >= arr[i])
                {
                     right[s.peek()]=(int) i;
                    s.pop();
                }
                right[i]=-1;
            }
            s.push(i);
        }
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

    for(int i=0;i<n;i++)
    
        System.out.println(left[i]+" ---> "+right[i]);
    }

    // Driver method
    public static void main(String[] args) {
        calculateSpan(arr, n, left,right,width,area);
    
    }

}
