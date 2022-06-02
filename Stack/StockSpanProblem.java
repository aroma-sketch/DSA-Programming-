package Stack;

 
import java.util.Stack;
import java.util.Arrays;

public class StockSpanProblem {
    static int arr[] = { 10, 4, 5, 90, 120, 80 };
    static int n = arr.length;
    static  int res[] = new int[n];

    static void calculateSpan(int arr[], int n, int res[]) {
        // Create a stack and push index of first element
        // to it
        Stack<Integer> s = new Stack<>();
        
        // s.push(0);

        // Span value of first element is always 1
        // res[0] = 1;

        // Calculate span values for rest of the elements
        for (int i = 0; i < n; i++) {

            if (!s.empty()) 
            {
                while (!s.empty() && arr[s.peek()] <= arr[i])
                {
                    s.pop();
                }
            }

            if (s.empty()) {
                res[i] = i + 1;
            } else {
                res[i] = i - s.peek();
            }
            // res[i] = (s.empty()) ? (i + 1) : (i - s.peek());

            s.push(i);
        }
    }

    // A utility function to print elements of array
    static void printArray(int arr[]) {
        System.out.print(Arrays.toString(arr));
    }

    // Driver method
    public static void main(String[] args) {
        calculateSpan(arr, n, res);
        printArray(res);
    }

}
