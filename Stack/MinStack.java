//MIN STACK USING EXTRA SPACE 
package Stack;

import java.util.Stack;
public class MinStack {

static  Stack<Integer> s = new Stack<>();
static  Stack<Integer> ss = new Stack<>();
static int ans=0;

  void push(int x)
    {
        s.push(x);
        if (ss.empty()||ss.peek()>=x) 
            ss.push(x);
        return ;
    }
    
    int pop()
    {
        if (s.empty()) 
            return -1;
          ans=s.peek();
          s.pop();
          if(ss.peek()==ans)
        ss.pop();
        return ans;
    }
    
 int getMin()
    {
        if(ss.empty())
return -1;
else
return ss.peek();
  }
  
// // Driver code

    public static void main(String args[])
    {
        
		MinStack s = new MinStack();
    s.push(10);
    s.push(20);
    s.push(30);
    System.out.println(s.getMin());
    s.push(5);
    System.out.println(s.getMin());
    }
}
    
