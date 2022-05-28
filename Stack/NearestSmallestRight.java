package Stack;

 
import java.util.Stack;
 class NearestSmallestRight {
      static  int arr[]={4,5,2,10,8};
    public static void NGE()
    {
        Stack<Integer> s =new Stack<>();
        int res[] = new int[arr.length];
        for (int i=arr.length-1;i>=0;i--)
        {
            if(!s.empty())
            {
                while (!s.empty() && s.peek() >=arr[i])
    
                { 
                    s.pop();
            }
                
            }
            if(s.empty())
            { 
                res[i]=-1; }
                
            else
            {
                res[i]=s.peek();
                
            }
            s.push(arr[i]);
            }
        
    
    for(int i=0;i<(arr.length);i++)
    
        System.out.println(arr[i]+ "-->"+res[i]);
    
    }
 
 //drivers code
 public static void main(String[] args)
 {
     NGE();
 }}