package Stack;

// A Stack based Java program to find next
// greater element for all array elements
// in same order as input.
import java.util.Stack;

class NearestGreaterRight {

	static int arr[] = { 1,3,0,0,1,2,4 };

	/* prints element and NGE pair for all
	elements of arr[] of size n */
	public static void printNGE()
	{
		Stack<Integer> s = new Stack<>();
		int nge[] = new int[arr.length];

		// iterate for rest of the elements
		for (int i = arr.length - 1; i >= 0; i--)
		{
			/* if stack is not empty, then
			pop an element from stack.
			If the popped element is smaller
			than next, then
			a) print the pair
			b) keep popping while elements are
			smaller and stack is not empty */
			if (!s.empty())
			{
				while (!s.empty()
					&& s.peek() <= arr[i])
				{
					s.pop();
				}
			}
// 			nge[i] = s.empty() ? -1 : s.peek(); (terenory operator)
			if(s.empty())
			{
			    nge[i]=-1;
			    
			}
			else{
			    nge[i]=s.peek();
			    
			}
			s.push(arr[i]);
		}
		for (int i = 0; i < arr.length; i++)
			System.out.println( arr[i] +" --> " + nge[i]);
	}

	/* Driver Code */
	public static void main(String[] args)
	{
		printNGE();
	}
}
